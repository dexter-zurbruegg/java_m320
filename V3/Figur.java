package V3;

public class Figur {
    private String charakterName;
    private Waffenverhalten waffenverhalten;

    public Figur(String charakterName, Waffenverhalten waffenverhalten) {
        this.charakterName = charakterName;
        this.waffenverhalten = waffenverhalten;
    }

    public void setWaffenverhalten(Waffenverhalten waffenverhalten) {
        this.waffenverhalten = waffenverhalten;
    }

    public void kaempfen() {
        System.out.println(charakterName + " kämpft!");
        waffenverhalten.benutzeWaffe();
    }

    public String getCharakterName() {
        return charakterName;
    }
}
