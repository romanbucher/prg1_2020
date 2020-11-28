package ch.teko.prg.tag03.solution;

public class Rectangle {

    //Attribute
    private String name;
    private int xPosition;
    private int yPosition;
    private double laenge;
    private double breite;

    //Konstruktoren
    public Rectangle(String name, int xPosition, int yPosition, double laenge, double breite) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rectangle(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.laenge = 1.0;
        this.breite = 1.0;
    }

    //Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    //Methode berechne Flaeche
    public double calcArea(){
        return this.breite * this.laenge;
    }

    //Methode print calculated area
    public void printCalculatedArea(){
        System.out.println("Area is: " + this.calcArea());
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("Rectange 1", 5,5,2.0,3.0);
        System.out.println(rec1.getName());
        System.out.println(rec1.getxPosition());
        System.out.println(rec1.getyPosition());
        rec1.printCalculatedArea();

        System.out.println("-------------");

        Rectangle rec2 = new Rectangle("Rectangle ", 2,2);
        System.out.println(rec2.getName());
        System.out.println(rec2.getLaenge());
        rec2.setLaenge(20.0);
        System.out.println(rec2.getBreite());
        rec2.setBreite(10.0);
        rec2.printCalculatedArea();
    }
}
