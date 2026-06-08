package lab11;

import lab1.Student;
import lab10.Exporter;
import lab10.StudentiInConsola;
import lab10.StudentiInFiserText;
import lab10.StudentiInFisierXlsx;

import java.util.Arrays;
import java.util.List;

public class AplicatieCuDecorator {
    public static void main(String[] args) {


        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70f),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10f),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90f)
        );

        Exporter exporter = new Exporter();

        ExportTimeDecorator consolaDecorata = new ExportTimeDecorator(new StudentiInConsola());
        ExportTimeDecorator textDecorat = new ExportTimeDecorator(new StudentiInFiserText("studenti_dec.txt"));
        ExportTimeDecorator excelDecorat = new ExportTimeDecorator(new StudentiInFisierXlsx("studenti_dec.xlsx"));


        IO.println("Exporturi");

        exporter.startExport(consolaDecorata, studenti);
        exporter.startExport(textDecorat, studenti);
        exporter.startExport(excelDecorat, studenti);
    }
}