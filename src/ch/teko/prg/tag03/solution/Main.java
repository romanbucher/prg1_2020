package ch.teko.prg.tag03.solution;

public class Main {

    public static void main(String[] args) {

        //Objekte
        Input in1 = new Input();
        Calculate calc1 = new Calculate();

        //Command Line App
        System.out.println("Dieses Programm erwartet 2 Integer Eingaben und berechnet die Summe");
        System.out.println("Bitte geben Sie ihre erste Zahl ein: ");

        //Methode von Input aufrufen und einer Integer Variable zuweisen
        int value1 = in1.readIntFromCommandLine();

        System.out.println("Bitte geben Sie ihre zweite Zahl ein: ");
        int value2 = in1.readIntFromCommandLine();

        //Methode sum von Calculate aufrufen und ausgeben
        System.out.println("Die Summe ist: " + calc1.sum(value1,value2));
    }
}
