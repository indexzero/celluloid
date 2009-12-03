package org.celluloidlang.examples;

import inria.meije.rc.sugarcubes.Machine;
import inria.meije.rc.sugarcubes.SC;
import inria.meije.rc.sugarcubes.Program;

class ReactiveHelloWorld
{
    public static void main(String[] args){
        // First one writes a reactive program.
        Program print = SC.print("Hello World!\n");

        // Then one makes a reactive execution machine.
        Machine machine = SC.machine();

        // One adds the program into the machine.
        machine.addProgram(print);

        // One makes the machine reacts for ten consecutive instants.
	for(int i = 1; i <= 10; i++){
            System.out.println("instant "+i+": ");
            machine.react();
        }
    }
}
