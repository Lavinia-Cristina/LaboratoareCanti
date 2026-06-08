package lab1;

import java.util.Objects;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;
    float nota;



    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota=0;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return numarMatricol + ", " + prenume + " " + nume + ", " + formatieDeStudiu + ","+nota;
    }
    //PENTRU 2.5.3 la LAB 2

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieDeStudiu);
    }
}
