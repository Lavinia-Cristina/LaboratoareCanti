package lab11;

import lab1.Student;
import lab10.IStudentiExport;
import java.util.List;

public class ExportTimeDecorator implements IStudentiExport {


    private IStudentiExport decoratedExport;

    public ExportTimeDecorator(IStudentiExport decoratedExport) {
        this.decoratedExport = decoratedExport;
    }

    @Override
    public void doExport(List<Student> studenti) {
        long startTime = System.currentTimeMillis();
        decoratedExport.doExport(studenti);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        IO.println("-> [Decorator] Timpul de executie pentru "
                + decoratedExport.getClass().getSimpleName()
                + " a fost: " + duration + " ms.\n");
    }
}