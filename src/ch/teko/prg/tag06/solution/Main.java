package ch.teko.prg.tag06.solution;

public class Main {
    public static void main(String[] args) {
        //Aufgabe 2
        Angestellter angestellter1 = new Angestellter("Muster", "Hans", 26, 123);
        angestellter1.printInformation();

        System.out.println("");

        Angestellter angestellter2 = new Angestellter();
        angestellter2.setMitarbeiterID(312);
        angestellter2.printInformation();

        System.out.println("\n");

        //Aufgabe 4
        Lehrling lehrling = new Lehrling("Muster","Peter",26,5000,5,123);
        System.out.println("Hallo " + lehrling.getVorname()+ " deine MitarbieterID ist " + lehrling.getMitarbeiterID());
    }
}
