package ch.teko.prg.tag06.input;

public class Shape {
    private String color;

    public Shape(){
        this("Blue");
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void printSmth(){
        System.out.println(this.color);
    }
}
