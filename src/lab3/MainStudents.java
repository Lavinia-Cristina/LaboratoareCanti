package lab3;

import lab1.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class MainStudents {
    public static void main(String[] args) {

        Path inputPath = Paths.get("src/studenti_in.txt");
        Path outputPath1 = Paths.get("src/studenti_out.txt");
        Path outputPath2 = Paths.get("src/studenti_out_sorted.txt");

        try {

            List<String> liniiFisier = Files.readAllLines(inputPath);
            List<Student> listaStudenti = new ArrayList<>();


            for (String linie : liniiFisier) {
                String[] parti = linie.split(",");

                int numarMatricol = Integer.parseInt(parti[0].trim());
                String prenume = parti[1].trim();
                String nume = parti[2].trim();
                String formatie = parti[3].trim();

                listaStudenti.add(new Student(numarMatricol, prenume, nume, formatie));
            }

            IO.println("Studentii din fisier: ");
            IO.println();
            for (Student s : listaStudenti) {
                IO.println(s);
            }

           IO.println("Sortare dupa nume: ");
            IO.println();
            listaStudenti.sort(new Comparator<Student>() {

                public int compare(Student s1, Student s2) {
                    return s1.getNume().compareTo(s2.getNume());
                }
            });


            List<String> liniiDeSalvat1 = new ArrayList<>();
            for (Student s : listaStudenti) {
                liniiDeSalvat1.add(s.toString());
            }
            Files.write(outputPath1, liniiDeSalvat1);
            IO.println("Studenti sortati dupa nume: " + outputPath1.getFileName());


            IO.println("Sortare dupa formatie: ");
            IO.println();

            listaStudenti.sort(new Comparator<Student>() {

                public int compare(Student s1, Student s2) {

                    int comparatieFormatie = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());


                    if (comparatieFormatie == 0) {
                        return s1.getNume().compareTo(s2.getNume());
                    }


                    return comparatieFormatie;
                }
            });


            List<String> liniiDeSalvat2 = new ArrayList<>();
            for (Student s : listaStudenti) {
                liniiDeSalvat2.add(s.toString());
            }
            Files.write(outputPath2, liniiDeSalvat2);
            IO.println("Sortarea dupa nume a fost salvata in " + outputPath2.getFileName());

        } catch (IOException e) {
            IO.println("Nu poate deschide fisierul studenti_txt" + e.getMessage());
        } catch (Exception e) {
            IO.println("Eroare la pasarea textului: " + e.getMessage());
        }
    }
}