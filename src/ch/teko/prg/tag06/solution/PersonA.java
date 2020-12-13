package ch.teko.prg.tag06.solution;

public class PersonA {
    private String nachname;
    private String vorname;
    public int alter;

    public PersonA(final String nachname, final String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public PersonA(){
        this("Hans","Peter");
        this.alter = 20;
    }

    public void printInformation(){
        System.out.println(this.vorname + " " + this.nachname + " " + this.alter);
    }
}
