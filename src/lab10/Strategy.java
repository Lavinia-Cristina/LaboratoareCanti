package lab10;

import lab1.Student;
import java.util.Arrays;
import java.util.List;

public class Strategy {
    public static void main(String[] args) {

        List<Student> studenti = Arrays.asList(
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


        Exporter exporter = new Exporter();


        IO.println("Export in Consola");
        exporter.startExport(new StudentiInConsola(), studenti);

        IO.println();
        IO.println("Export in Fisier Text");
        exporter.startExport(new StudentiInFiserText("studentiStrategyText.txt"), studenti);

        IO.println();
        IO.println("Export in Fisier Excel");
        exporter.startExport(new StudentiInFisierXlsx("studentiStrategyExcel.xlsx"), studenti);


    }
}