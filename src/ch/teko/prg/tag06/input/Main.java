package ch.teko.prg.tag06.input;

public class Main {

    public static void main(String[] args) {

        //Java foreach
        int[] intArray = {2,4,5,6,1,2,3};

        for(int i : intArray){
            System.out.println(i);
        }

        //Konstruktorverkettung
        //this()
        //Beispiel Klasse Auto
        Auto a1 = new Auto("Ferrari", 1987, 478);
        System.out.println(a1.getLeistung());


        //Beispiel Klasse Circle
        Circle c1 = new Circle();
        c1.printSmth();
    }
}
