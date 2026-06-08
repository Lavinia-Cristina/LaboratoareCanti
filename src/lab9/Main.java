package lab9;

import lab1.Student;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70f),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10f),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90f),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10f),
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10f),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33f),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20f),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12f),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22f)
        );


       IO.println("Nota 10:");
        studentiCuNote.stream().filter(s -> s.getNota() == 10f).forEach(System.out::println);


        IO.println("Nota < 5:");
        studentiCuNote.stream().filter(s -> s.getNota() < 5f).forEach(System.out::println);


        IO.println("Lista modificata (nota < 4 devine 4):");
        List<Student> modificati = studentiCuNote.stream()
                .map(s -> s.getNota() < 4f ? new Student(s.getNumarMatricol(), s.getPrenume(), s.getNume(), s.getFormatieDeStudiu(), 4f) : s)
                .toList();
        modificati.forEach(System.out::println);

        float suma = (float) studentiCuNote.stream().mapToDouble(Student::getNota).sum();
        IO.println("Suma notelor: " + suma);


        double media = studentiCuNote.stream().mapToDouble(Student::getNota).average().orElse(0.0);
        IO.println("Media notelor: " + media);
    }
}