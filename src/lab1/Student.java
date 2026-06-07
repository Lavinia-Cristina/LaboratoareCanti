package lab1;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;


    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }


    @Override
    public String toString() {
        return numarMatricol + ", " + prenume + " " + nume + ", " + formatieDeStudiu;
    }
}