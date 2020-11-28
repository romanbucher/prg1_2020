package ch.teko.prg.tag03.input;

public class Pferd {

    //Attribute
    public int grösse;
    public int höchstgeschwindigkeit;
    public int geschwindigkeit;

    //Konstruktoren
    public Pferd(int grösse, int höchstgeschwindigkeit, int geschwindigkeit) {
        this.grösse = grösse;
        this.höchstgeschwindigkeit = höchstgeschwindigkeit;
        this.geschwindigkeit = geschwindigkeit;
    }

    //Methoden
    public int getGrösse() {
        return grösse;
    }

    public void setGrösse(int grösse) {
        this.grösse = grösse;
    }

    public int getHöchstgeschwindigkeit() {
        return höchstgeschwindigkeit;
    }

    public void setHöchstgeschwindigkeit(int höchstgeschwindigkeit) {
        this.höchstgeschwindigkeit = höchstgeschwindigkeit;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    //Rückgabetyp Teil der Signatur der Methode?
    public void springen() {
        System.out.println("JUMP");
    }

    /*
    public String springen(){
        return "JUMP";
    }
    */

    public void springen(String kunststück){
        System.out.println("JUMP");
    }

    public void springen(int kunststück){
        System.out.println("JUMP");
    }

    public static void main(String[] args) {
        Pferd p1 = new Pferd(120, 50, 40);
        p1.springen();
    }

}
