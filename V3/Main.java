package V3;

/**
 * Entry point for the application.
 * This class initializes the menu and adds characters to it.
 */
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