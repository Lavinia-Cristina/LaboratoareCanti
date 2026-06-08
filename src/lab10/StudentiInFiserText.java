package lab10;

import lab1.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentiInFiserText implements IStudentiExport {

    public StudentiInFiserText(String file) {
    }

    @Override
    public void doExport(List<Student> students) {
        try {
            List<String> linii = new ArrayList<>();
            for (Student s : students) {
                linii.add(s.toString());
            }
            Files.write(Paths.get("studenti_export.txt"), linii);
            System.out.println("Succes: Export realizat in 'studenti_export.txt'.");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea in fisierul text: " + e.getMessage());
        }
    }
}
