import java.io.File;
import java.util.Scanner;

public class Einkaufanalyse {
    public static void main(String[] args) throws Exception {

        File datei = new File ("einkaufliste.txt");
        Scanner scanner = new Scanner(datei);

        int anzahl = 0;
        double gesamtpreis = 0;

        while (scanner.hasNext()) {
            String artikel = scanner.next();
            double preis = scanner.nextDouble();

            anzahl++;
            gesamtpreis = gesamtpreis + preis;

        }

        scanner.close();

        IO.println("Anzahl der Artikel: " + anzahl);
        System.out.printf("Gesamtpreis: %.2f Euro%n", gesamtpreis);
    }
}
