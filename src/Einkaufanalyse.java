import java.io.File;
import java.util.Scanner;

public class Einkaufanalyse {
    public static void main(String[] args) throws Exception {

        File datei = new File ("einkaufliste.txt");
        Scanner scanner = new Scanner(datei);

        int anzahl = 0;
        double gesamtpreis = 0;
        double hoechsterPreis = 0;
        String teuersterArtikel = "";
        double niedrigsterPreis = 0;
        String guenstigsterArtikel = "";
        int anzahlUnterZweiEuro = 0;
        int anzahlUeberDreiEuro = 0;

        while (scanner.hasNext()) {
            String artikel = scanner.next();
            double preis = scanner.nextDouble();

            anzahl++;
            gesamtpreis = gesamtpreis + preis;

            if (preis > hoechsterPreis) {
                hoechsterPreis = preis;
                teuersterArtikel = artikel;
            }
            if (anzahl == 1 || preis < niedrigsterPreis) {
                niedrigsterPreis = preis;
                guenstigsterArtikel = artikel;
            }
            if (preis < 2) {
                anzahlUnterZweiEuro++;
            }
            if (preis > 3) {
                anzahlUeberDreiEuro++;
            }
        }

        scanner.close();
        double durchschnitt = 0;
        if (anzahl > 0) {
            durchschnitt = gesamtpreis / anzahl;
        }
        double rabatt = gesamtpreis * 0.10;
        double preisMitRabatt = gesamtpreis - rabatt;
        double preisunterschied = hoechsterPreis - niedrigsterPreis

        IO.println("Anzahl der Artikel: " + anzahl);
        System.out.printf("Gesamtpreis: %.2f Euro%n", gesamtpreis);
        System.out.printf("Durchschnittpreis: %.2f Euro%n", durchschnitt);
        IO.println("Teuerster Artikel: " + teuersterArtikel);
        System.out.printf ("Hoechster Preis: %.2f Euro%n", hoechsterPreis);
        IO.println("Guenstigster Artikel: " + guenstigsterArtikel);
        System.out.printf("Niedrigster Preis: %.2f Euro %n", niedrigsterPreis);
        IO.println ("Artikel unter 2 Euro: " + anzahlUnterZweiEuro);
        System.out.printf("Gesamtpreis mit 10 Prozent Rabatt: %.2f Euro%n", preisMitRabatt);
        IO.println("Artikel ueber 3 Euro " + anzahlUeberDreiEuro);
        System.out.printf("Preisunterschied: %.2f Euro%n", preisunterschied);
    }
}
