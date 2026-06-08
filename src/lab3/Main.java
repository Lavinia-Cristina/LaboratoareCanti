package lab3;
import lab1.Student;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path inputPath = Paths.get("src/lab3/in.txt");
        Path outputPath = Paths.get("src/lab3/out.txt");

        try {
            String continutFisier = new String(Files.readAllBytes(inputPath));
            String[] liniiArray = continutFisier.split("\n");

            List<String> liniiInMemorie = new ArrayList<>(Arrays.asList(liniiArray));
            List<String> liniiPentruSalvare = new ArrayList<>();

            IO.println("a) Newline la sfarsit");
            IO.println();

            for (String linie : liniiInMemorie) {
                linie = linie.replace("\r", " ");

                String linieModificataA = linie + "\n";
                IO.println(linieModificataA);
            }

            IO.println();

            IO.println("b) Newline dupa punct");
            IO.println();
            IO.println();

            for (String linie : liniiInMemorie) {
                linie = linie.replace("\r", "");

                String linieModificataB = getString(linie);
                IO.println(linieModificataB);


                String linieCombinata = linieModificataB + "\n";
                liniiPentruSalvare.add(linieCombinata);
            }


            Files.write(outputPath, liniiPentruSalvare);
            IO.println("c) Scriere in fisier");
            IO.println();

        } catch (IOException e) {
            IO.println("A aparut o eroare la citirea sau scrierea fisierelor: " + e.getMessage());
        }
    }

    private static String getString(String linie) {
        String[] propozitii = linie.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < propozitii.length; i++) {
            sb.append(propozitii[i]);
            if (i < propozitii.length - 1 || linie.endsWith(".")) {
                sb.append(".\n");
            }
        }

        return sb.toString();
    }
}