package V3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Figur axtKrieger = new AxtKrieger("Axtkrieger");
        Figur stabMagier = new StabMagier("Stabmagier");
        Figur dolchSchurke = new DolchSchurke("Dolchschurke");

        menu.addFigur(axtKrieger);
        menu.addFigur(stabMagier);
        menu.addFigur(dolchSchurke);

        menu.ausfuehren();
    }
}