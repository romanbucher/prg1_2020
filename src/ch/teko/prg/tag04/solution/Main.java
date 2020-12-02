package ch.teko.prg.tag04.solution;

public class Main {
    public static void main(String[] args) {
        Kontrollstruktur k1 = new Kontrollstruktur("k1", 1.1);
        System.out.println(k1.calculatePrice(27));
        System.out.println(k1.testEvaluate(6));
        k1.counter();

        //Aufgabe 5 und 6
        int summe = 0;
        for(int i = 0; i <= 10; i++){
            summe+=i*i;
        }
        System.out.println(summe);

        summe = 0;
        int k = 0;
        while (k <= 10){
            summe+=k*k;
            k++;
        }
        System.out.println(summe);
    }
}
