package lab1;

public class Main {
    public static void main(String[] args) {
        IO.println("Laborator 1:");
        IO.println();

        Student s1 = new Student(112, "Ioan", "Popa", "TI21/1", 8.70f);
        Student s2 = new Student(112, "Maria", "Oprea", "TI21/1", 8.70f);
        Student s3 = new Student(120, "Alis", "Popa", "TI21/2", 8.70f);
        Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1", 8.70f);
        Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2", 8.70f);

        Student[] studenti = {s1, s2, s3, s4, s5};

        for (Student student : studenti) {
            IO.println(student);
        }
    }
}