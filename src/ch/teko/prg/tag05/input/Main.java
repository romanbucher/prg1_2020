package ch.teko.prg.tag05.input;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int no = 0;
        int dice1, dice2, dice3;

        do {
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            dice3 = (int)(Math.random() * 6) + 1;
            no += 1;

        } while (!((dice1==6) && (dice2==6) && (dice3==6)));

        System.out.println("Required " + no + " tries.");

        /*
        int[] arr1 = new int[5];
        System.out.println(arr1[3]);

        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr2[3]);
         */

        /*
        String[] arr3 = new String[3];
        System.out.println(arr3[2]);

        String[] arr4 = {"Das", "ist", "ein", "Array"};
        System.out.println(arr4[2]);
         */

        /*
        double[] arr5 = {1.1,2.2,3.3,4.4,5.5};
        System.out.println(arr5);

        /*
        for (int i = 0; i <= arr5.length; i++){
            System.out.println(arr5[i]);
        }
         */

        /*
        String[] arr6 = new String[4];

        arr6[0] = "TEST";
        arr6[1] = "TEST";

        for (short i=2; i < arr6.length; i++){
            arr6[i] = "test";
        }

        for (int i=0; i < arr6.length; i++){
            System.out.println(arr6[i]);
        }
        */

        /*
        int[] arr7 = new int[5];
        System.out.println(arr7[arr7.length-1]);
        Arrays.fill(arr7, 4);
        System.out.println(arr7[arr7.length-1]);
        arr7[arr7.length-1] = 2;
        System.out.println(arr7[arr7.length-1]);
        Arrays.sort(arr7);
        System.out.println(arr7[arr7.length-1]);
        */
        
    }
}
