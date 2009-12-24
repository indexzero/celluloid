/**
 * Created by IntelliJ IDEA.
 * User: Charlie
 * Date: Dec 24, 2009
 * Time: 4:29:05 PM
 * To change this template use File | Settings | File Templates.
 */

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;

public class celluloidTranslator extends TreeParser {


    protected HashMap<String, String> typeMap = new HashMap<String, String>();

    protected HashMap<String, VariableInfo> symbolTable = new HashMap<String, VariableInfo>();

    protected HashMap<String, FunctionInfo> functionTable = new HashMap<String, FunctionInfo>();

    public celluloidTranslator(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    
    public celluloidTranslator(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);

        this.symbolTable = new HashMap<String, VariableInfo>();
        this.functionTable = new HashMap<String, FunctionInfo>();

        // TODO: This should be configurable for multiple-language targets
        typeMap.put("number", "double");
        typeMap.put("string", "String");
        typeMap.put("time", "float");
        typeMap.put("boolean", "boolean");

        // TODO: This is just plain wrong ... needs to be reimplemented for alpha release
        typeMap.put("AudioFile", "JMFAudio");
        typeMap.put("VideoFile", "JMFVideo");
        typeMap.put("Audio", "SwingOutput");
        typeMap.put("Video", "SwingOutput");
        typeMap.put("input", "input");
        
        // TODO: This is just plain wrong ... needs to be reimplemented for alpha release
        typeMap.put("STOPPED", "STATUS=STOPPED");
        typeMap.put("PLAYING", "STATUS=PLAYING");
    }

    public static String parseTime(String time) {
      float builtTime = 0;
      float buildUp = 0;
      float buildUpExponent = 0;
      boolean dot = false;
      boolean exponent = false;
      float fraction = 1;
      if("@start".equals(time)) return "0f";
      if("@now".equals(time)) return "0f"; //@TODO support @NOW
      time = time.substring(1, time.length());

      while(time.length() > 0) {
        char cur = time.charAt(0);
        time = time.substring(1, time.length());
        switch(cur) {
          case 'd':
            builtTime += (86400000 * buildUp / fraction) * Math.pow(10, buildUpExponent);
            buildUp = 0; buildUpExponent = 0; fraction = 1; dot = false; exponent = false;
            break;
          case 'h':
            builtTime += (3600000 * buildUp / fraction) * Math.pow(10, buildUpExponent);
            buildUp = 0; buildUpExponent = 0; fraction = 1; dot = false; exponent = false;
            break;
          case 'm':
            builtTime += (60000 * buildUp / fraction) * Math.pow(10, buildUpExponent);
            buildUp = 0; buildUpExponent = 0; fraction = 1; dot = false; exponent = false;
            break;
          case 's':
            builtTime += (1000 * buildUp / fraction) * Math.pow(10, buildUpExponent);
            buildUp = 0; buildUpExponent = 0; fraction = 1; dot = false; exponent = false;
            break;
          case '.':
            dot = true;
            break;
          case 'e':
          case 'E':
            exponent = true;
            break;
          default:
            if(exponent) {
              buildUpExponent = buildUpExponent * 10 + new Float(String.valueOf(cur));
              continue;
            }
            else if(dot) {
              fraction *= 10;
            }

            buildUp = buildUp*10 + new Float(String.valueOf(cur));
        }
      }

      return Float.valueOf(builtTime).toString() + "f";
    }

    protected boolean validateExistenceOfEvent(String eventName) {
        return false;
    }

    protected boolean validateExistenceOfConstraint(String constraintName) {
        return false;
    }

    protected boolean validateExistenceOfDevice(String deviceName) {
        return false;
    }

    protected boolean validateExistenceOfVariable(String varName) {
        return false;
    }

    protected boolean validateExistenceOfFunction(String functionName) {
        return false;
    }

    



}
