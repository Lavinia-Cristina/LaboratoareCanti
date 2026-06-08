package lab10;

import lab1.Student;

import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport {

    public StudentiInFisierXlsx(String s) {
    }

    @Override
    public void doExport(List<Student> students) {

        System.out.println("Exportul a " + students.size() + " studenti s-a realizat in format XLSX.");
    }
}