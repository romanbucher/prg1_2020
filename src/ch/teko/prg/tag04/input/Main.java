package ch.teko.prg.tag04.input;

public class Main {

    public static void main(String[] args) {

        //numeric promotion examples
        float f1 = 1.0f;
        double d1 = 20.0;
        long l1 = 100L;
        int i1 = 10;
        short s1 = 10;
        byte b1 = 100;

        double result = b1 / s1 + f1 * l1 + d1;
        System.out.println(result);

        int i2 = 10;
        float f2 = 3.0f;
        System.out.println(i2 / f2);

        int i3 = 10;
        int i4 = 3;
        System.out.println(i3 / i4);

        int i5 = 10;
        int i6 = 3;
        System.out.println(i5 / i6 +" R: "+i5 % i6);

        //char ist 2 byte = 16 bit
        char c0 = 0x41;
        System.out.println(c0);

        // https://www.torsten-horn.de/techdocs/ascii.html
        char c1 = 'a';
        int i7 = c1;
        System.out.println(i7);

        byte var1 = 127;
        byte var2 = 1;
        byte var3 = (byte) (var1 + var2);
        System.out.println(var3);

        byte var4 = 127;
        byte var5 = 1;
        int var6 = var4 + var5;
        System.out.println(var6);
    }
}
