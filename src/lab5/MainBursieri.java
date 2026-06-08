package lab5;

import lab1.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainBursieri {
    public static void main(String[] args) {
        List<StudentBursier> bursieri = new ArrayList<>();
        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70f, 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80f, 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90f, 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10f, 780.80));


        writeToFile("bursieri_out.txt", bursieri);

        IO.println("Lista de bursieri a fost salvata cu succes in fisierul bursieri_out.txt!");
    }


    public static void writeToFile(String filename, Collection<? extends Student> studenti) {
        Path path = Paths.get(filename);
        List<String> lines = new ArrayList<>();

        for (Student s : studenti) {
            lines.add(s.toString());
        }

        try {
            Files.write(path, lines);
        } catch (IOException e) {
            IO.println("Eroare la scrierea fisierului: " + e.getMessage());
        }
    }
}