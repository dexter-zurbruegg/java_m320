package V3;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    private ArrayList<Figur> figuren = new ArrayList<>();

    public void addFigur(Figur figur) {
        figuren.add(figur);
    }

    public void zeigeMenu() {
        System.out.println("Wähle eine Option:");
        System.out.println("1. Alle Figuren und ihr Waffenverhalten anzeigen");
        System.out.println("2. Waffenverhalten einer Figur ändern");
        System.out.println("3. Beenden");
    }

    public void zeigeFiguren() {
        for (int i = 0; i < figuren.size(); i++) {
            System.out.println((i + 1) + ". " + figuren.get(i).getCharakterName());
        }
    }

    public void ausfuehren() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            zeigeMenu();
            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Zeilenumbruch konsumieren

            switch (auswahl) {
                case 1:
                    System.out.println("Figuren und ihr Waffenverhalten:");
                    for (Figur figur : figuren) {
                        System.out.print(figur.getCharakterName() + ": ");
                        figur.kaempfen();
                    }
                    break;
                case 2:
                    System.out.println("Wähle eine Figur, um die Waffe zu ändern:");
                    zeigeFiguren();
                    int figurenAuswahl = scanner.nextInt();
                    scanner.nextLine(); // Zeilenumbruch konsumieren
                    if (figurenAuswahl > 0 && figurenAuswahl <= figuren.size()) {
                        Figur ausgewaehlteFigur = figuren.get(figurenAuswahl - 1);
                        System.out.println("Wähle eine neue Waffe:");
                        System.out.println("1. Axt");
                        System.out.println("2. Stab");
                        System.out.println("3. Dolch");
                        int waffenAuswahl = scanner.nextInt();
                        scanner.nextLine(); // Zeilenumbruch konsumieren

                        switch (waffenAuswahl) {
                            case 1:
                                ausgewaehlteFigur.setWaffenverhalten(new AxtVerhalten());
                                break;
                            case 2:
                                ausgewaehlteFigur.setWaffenverhalten(new StabVerhalten());
                                break;
                            case 3:
                                ausgewaehlteFigur.setWaffenverhalten(new DolchVerhalten());
                                break;
                            default:
                                System.out.println("Ungültige Auswahl.");
                        }
                    } else {
                        System.out.println("Ungültige Figurenwahl.");
                    }
                    break;
                case 3:
                    System.out.println("Menü wird beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }
    }
}