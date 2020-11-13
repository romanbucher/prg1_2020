package ch.teko.prg.tag01.solution;

//Importieren einer Klasse der Java API
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Erstellen von Objekten der Klasse Pkw
        Pkw auto1 = new Pkw("Mercedes", "C-Klasse", 200);
        System.out.println("Auto 1:");
        System.out.println(auto1.getMarke());
        System.out.println(auto1.getModell());
        System.out.println(auto1.getPs());

        Pkw auto2 = new Pkw("BMW", "i330", 250);
        auto2.setPs(180);
        System.out.printf("Auto 2: %s, %s, %d ps", auto2.getMarke(), auto2.getModell(), auto2.getPs());

        //Testen der Klasse Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nEnter username: ");
        String userName = myObj.nextLine();
        System.out.println("USername is: " + userName);
    }
}
