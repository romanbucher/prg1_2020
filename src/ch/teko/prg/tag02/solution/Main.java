package ch.teko.prg.tag02.solution;

public class Main {
    public static void main(String[] args) {
        //ue oop_02
        Book book1 = new Book("Herr der Ringe Teil 1", "J.R.R. Tolkien", 20.5, 2003);
        System.out.printf("%s%n%s%n%f%n%d%n", book1.getTitel(), book1.getAutor(), book1.getPreis(), book1.getKaufjahr());

        System.out.println("\n");

        //ue_oop_02_01 Aufgabe 3
        Position pos1 = new Position();
        System.out.println(pos1.getX() + "," + pos1.getY());

        //ue_oop_02_03
        Adresse adresse1 = new Adresse("Pilatusstrasse", 38, 6003, "Luzern");
        System.out.println("Die Adresse der TEKO in Luzern ist: ");
        System.out.println(adresse1.getStrasse() + " " + adresse1.getNummer() + "\n" + adresse1.getPlz() + " " + adresse1.getWohnort());
    }
}
