package ch.teko.prg.tag03.solution;

import java.util.Scanner;

public class Input {

    //Attribute
    private Scanner myScanner;

    //Kosntruktor
    public Input() {
        this.myScanner = new Scanner(System.in);
    }

    //Methoden
    public int readIntFromCommandLine() {
        return this.myScanner.nextInt();
    }
}
