package ch.teko.prg.tag05.solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Aufgabe 3
        Balloon[] b = new Balloon[5];

        for(int i = 0; i < b.length; i++) {
            b[i] = new Balloon("red",(int)(Math.random()*100));
        }

        for(int i = 0; i < b.length; i++) {
            System.out.println("Balloon on Position " + i + " has size " + b[i].getSize());
        }

        for(int i = 0; i < b.length; i++) {
            b[i].blowUp(50.0);
        }

        System.out.println("");

        for(int i = 0; i < b.length; i++) {
            if (b[i].getSize() > 0.0){
                System.out.println("Balloon on Position " + i + " has size " + b[i].getSize());
            }
        }

        //Aufgabe 4
        double[] squares = new double[10];

        for (int i = 0; i < squares.length; i++){
            squares[i] = i*i;
            System.out.println("Das Quadrat von " + (double)i + " ist " + squares[i]);

        } System.out.println("");

        Arrays.fill(squares,1.0);

        for (int i = 0; i < squares.length; i++){
            System.out.println(squares[i]);
        }

    }
}
