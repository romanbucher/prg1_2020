package ch.teko.prg.tag06.solution;

public class Angestellter extends PersonA {

    private int mitarbeiterID;

    public Angestellter(){

    }

    public Angestellter(String nachname, String vorname, int alter, int mitarbeiterID) {
        super(nachname, vorname);
        super.alter = alter;
        this.mitarbeiterID = mitarbeiterID; // this.setMitarbeiterID(mitarbeiterID);
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print(this.getMitarbeiterID());
    }
}
