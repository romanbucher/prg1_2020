package ch.teko.prg.tag02.input;

public class Mensch {

    //Attribute
    public String name;
    public String vorname;
    public int alter;
    public int lohn;

    public Mensch(String name, String vorname, int alter, int lohn) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.lohn = lohn;
    }

    //Methoden
    public String getName() {
        return name;
    }

    public void abc(int lohnParameter) {
        this.lohn = lohnParameter;
    }
}
