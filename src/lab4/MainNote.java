package lab4;

import lab1.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainNote {
    public static void main(String[] args) {
        Path pathStudenti = Paths.get("src/studenti_in.txt");
        Path pathNote = Paths.get("src/note_anon.txt");


        HashMap<Integer, Student> mapStudenti = new HashMap<>();

        try {

            List<String> liniiStudenti = Files.readAllLines(pathStudenti);
            for (String linie : liniiStudenti) {
                String[] parti = linie.split(",");

                int numarMatricol = Integer.parseInt(parti[0].trim());
                String prenume = parti[1].trim();
                String nume = parti[2].trim();
                String formatie = parti[3].trim();

                Student s = new Student(numarMatricol, prenume, nume, formatie, 8.70f);
                mapStudenti.put(numarMatricol, s);
            }
        } catch (IOException e) {
            IO.println("Eroare la citire txt: " + e.getMessage());
        }

        try {

            List<String> liniiNote = Files.readAllLines(pathNote);
            for (String linie : liniiNote) {
                String[] parti = linie.split(",");

                int numarMatricol = Integer.parseInt(parti[0].trim());
                float nota = Float.parseFloat(parti[1].trim());


                if (mapStudenti.containsKey(numarMatricol)) {
                    mapStudenti.get(numarMatricol).setNota(nota);
                }
            }
        } catch (IOException e) {
            IO.println("Eroare la citirea 'note_anon.txt': " + e.getMessage());
        }

        IO.println("Lista cu note alocate: ");
        IO.println();


        for (Student s : mapStudenti.values()) {
            IO.println(s);
        }

        IO.println();
        IO.println("Studenti");
        IO.println();

        float notaM = gasesteNota("Bianca", "Popescu", mapStudenti);
        float notaN = gasesteNota("Ioan", "Popa", mapStudenti);

        System.out.println("Nota Bianca Popescu: " + notaM);
        System.out.println("Nota Ioan Popa: " + notaN);
    }


    public static float gasesteNota(String prenume, String nume, Map<Integer, Student> ultimaInstantaMap) {


        HashMap<String, Student> mapDupaNume = new HashMap<>();

        for (Student s : ultimaInstantaMap.values()) {
            String cheie = s.getPrenume() + "-" + s.getNume();
            mapDupaNume.put(cheie, s);
        }


        String cheieCautata = prenume + "-" + nume;
        if (mapDupaNume.containsKey(cheieCautata)) {
            return mapDupaNume.get(cheieCautata).getNota();
        }

        return 0;
    }
}