package ch.teko.prg.tag04.solution;

public class Kontrollstruktur {
    private String name;
    private double version;

    public Kontrollstruktur(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    // Aufgabe 1
    public double calculatePrice(int alter){
        double price;
        if (alter <= 6){
            price = 0.0;
        } else if (alter <= 12) {
            price = 5.0;
        } else if (alter <= 18) {
            price = 10.0;
        } else if (alter < 65) {
            price = 15.0;
        } else {
            price = 7.5;
        }
        return price;
    }

    // Aufgabe 2
    public String testEvaluate(int points) {
        String response = "Ergebnis:";
        if ((points < 0) || (points > 10)) {
            response = "Invalid points entered";
        } else {
            switch (points) {
                case 10:
                    response += " Sehr Gut";
                    break;
                case 9:
                    response += " Gut";
                    break;
                case 8:
                    response += " Befriedigend";
                    break;
                case 7:
                    response += " Ausreichend";
                    break;
                default:
                    response += " Leider nicht genuegend Punkte erreicht";
            }
        }
        return response;
    }

    // Aufgabe 3
    public void counter(){
        int i = 10;
        while (i > 0){
            System.out.println(i);
            i--;
        }
    }
}
