import java.io.File;
import java.util.Scanner;

public class Einkaufanalyse {
    public static void main(String[] args) throws Exception {

        File datei = new File ("einkaufliste.txt");
        Scanner scanner = new Scanner(datei);

        while (scanner.hasNextLine()) {
            String zeile = scanner.nextLine();
            IO.println("Artikel: " + zeile);
        }

        scanner.close();
    }
}
