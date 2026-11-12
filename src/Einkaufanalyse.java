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

        while (scanner.hasNext()) {
            String artikel = scanner.next();
            double preis = scanner.nextDouble();

            anzahl++;
            gesamtpreis = gesamtpreis + preis;

            if (preis > hoechsterPreis) {
                hoechsterPreis = preis;
                teuersterArtikel = artikel;
            }
        }

        scanner.close();
        double durchschnitt = 0;
        if (anzahl > 0) {
            durchschnitt = gesamtpreis / anzahl;
        }

        IO.println("Anzahl der Artikel: " + anzahl);
        System.out.printf("Gesamtpreis: %.2f Euro%n", gesamtpreis);
        System.out.printf("Durchschnittpreis: %.2f Euro%n", durchschnitt);
        IO.println("Teuerster Artikel: " + teuersterArtikel);
        System.out.printf ("Hoechster Preis: %.2f Euro%n", hoechsterPreis);
    }
}
