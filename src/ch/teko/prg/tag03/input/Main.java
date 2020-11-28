package ch.teko.prg.tag03.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int divisor = 2;
        int number;

        System.out.printf("%s%n", "Zahl eingeben, die getestet werden soll, ob sie durch 2 teilbar ist");
        number = scanner.nextInt();

        if ((number > 0) && (number > divisor)) {
            result = number % divisor;

            switch (result) {
                case 0:
                    System.out.println("Durch 2 teilbar");
                    break;
                case 1:
                    System.out.println("Nicht durch 2 teilbar");
                    break;
            }
        } else {
            System.out.println("Input Number not valid");
        }
    }
}
