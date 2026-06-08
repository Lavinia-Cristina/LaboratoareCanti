package lab10;

import lab1.Student;

import java.util.List;

public class Inporter {
    public List<Student> startImport(IStudentiImport strategyInstance, String numeFisier) {
        return strategyInstance.doImport(numeFisier);
    }
}