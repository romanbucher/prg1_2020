package ch.teko.prg.tag01.solution;

public class Pkw {
    //Attribute
    public String marke;
    public String modell;
    private int ps;

    //Konstruktor(en)
    public Pkw(String marke, String modell, int ps) {
        this.marke = marke;
        this.modell = modell;
        this.ps = ps;
    }

    //Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public static void main(String[] args) {
        Pkw auto1 = new Pkw("Mercedes", "C-Klasse", 180);
        auto1.setPs(200);
        System.out.println(auto1.getPs());
    }

}
