package ch.teko.prg.tag05.solution;

public class Balloon {
    private double size;
    private String color;

    public Balloon(String color, int size) {
        this.size = size;
        this.color = color;
    }

    public void blowUp(double size) {
        if ((getSize()+size) > 100.0){
            setSize(0.0);
        } else {
            setSize(getSize()+size);
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
