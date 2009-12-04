package org.celluloidlang.examples;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.media.CannotRealizeException;
import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.Time;

/**
 * sample file showing how to play audio file in JMF
 * @author blake
 *
 */
public class PlayAudio {
	public static void main(String[] args) {
		File file = new File("playme.wav");
		File file2 = new File("kdrum.wav");

		try {

			Player audio1 = Manager.createRealizedPlayer(file.toURI().toURL());
			Player audio2 = Manager.createRealizedPlayer(file2.toURI().toURL());
			
			
			PlayMe go = new PlayMe(audio1, audio2);
			
			go.play();

		} catch (NoPlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CannotRealizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class PlayMe implements ControllerListener {
	Player player;
	Player audio1;
	Player audio2;
	int i = 0;

	public PlayMe(Player player) {
		this.player = player;
		player.addControllerListener(this);
	}

	public PlayMe(Player[] play) {
		// TODO Auto-generated constructor stub
	}

	public PlayMe(Player audio1, Player audio2) {
		
		this(audio2);
		this.audio1 = audio1;
		this.audio2 = audio2;

		//audio2.mapToTimeBase(new Time(audio1.getTimeBase().getTime().getNanoseconds()+1000));
		
	}

	public void play() {
		audio1.prefetch();
		audio2.prefetch();
		

	}

	public void stop() {
		audio1.stop();
		audio1.deallocate();
		audio2.stop();
		audio2.deallocate();
	}

	public void destroy() {
		audio1.close();
		audio2.close();
	}

	@Override
	public void controllerUpdate(ControllerEvent event) {
		i++;
		System.out.println(i+" "+event.toString());
		
		if (event instanceof EndOfMediaEvent) {
			
				destroy();
				
		}
		if(event instanceof PrefetchCompleteEvent){
			audio2.syncStart(new Time(audio1.getTimeBase().getNanoseconds()+1000));
			audio1.start();
			//audio2.stop();
			
		}
			   

		
	}
	}

