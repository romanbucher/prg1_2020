package ch.teko.prg.tag02.solution;

public class Adresse {
    //Instanzvariablen
    public String strasse;
    private int nummer;
    public int plz;
    public String wohnort;

    //Konstruktor(en)
    public Adresse(String strasse, int nummer, int plz, String wohnort) {
        this.strasse = strasse;
        this.nummer = nummer;
        this.plz = plz;
        this.wohnort = wohnort;
    }

    //Methoden
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

}
