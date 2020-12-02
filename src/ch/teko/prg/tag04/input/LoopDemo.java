package ch.teko.prg.tag04.input;

public class LoopDemo {

    public void starsWithFor(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.println();
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
        }

        for (int k = numberOfStars; k > 0; k--){
            System.out.println();
            for (int l = 0; l < k; l++){
                System.out.print("*");
            }
        }

    }

    public void starsWithWhile(int numberOfStars){
        int i = 0;
        while (i < numberOfStars) {
            System.out.println();
            int a = 0;
            while (a < i){
                System.out.print("*");
                a++;
            }
            i++;
        }

        int k = numberOfStars;
        while (k > 0) {
            System.out.println();
            int l = 0;
            while (l < k) {
                System.out.print("*");
                l++;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        LoopDemo demo1 = new LoopDemo();
        demo1.starsWithFor(5);
        demo1.starsWithWhile(5);

    }

}
