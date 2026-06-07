package lab2;
import lab1.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        IO.println("Laborator 2: ");

        List<Integer> x = new ArrayList<>(Arrays.asList(3, 8, 1, 4, 7));
        List<Integer> y = new ArrayList<>(Arrays.asList(4, 1, 9, 2, 8, 5, 0));

        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();


        Collections.sort(x);
        Collections.sort(y);
        IO.println();

        IO.println("Liste sortate: ");
        IO.println();

        IO.println("Lista x (sortata): " + x);
        IO.println("Lista y (sortata): " + y);

        IO.println();

        // a) xPlusY contine toate elementele
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        IO.println("a) xPlusY: " + xPlusY);
        IO.println();

        IO.println("Sortate:");
        IO.println();

        Collections.sort(xPlusY);
        System.out.println("a) xPlusY:" + xPlusY);

        IO.println();
        IO.println();

        // b) zSet valori comune, luate doar o data
        zSet.addAll(x);
        zSet.retainAll(y);
        IO.println("b) zSet (comune): " + zSet);

        IO.println();

        // c) xMinusY x fara valorile din y
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        IO.println("c) xMinusY: " + xMinusY);

        IO.println();

        // d) xPlusYLimitedByP
        for (Integer valoare : xPlusY) {
            if (valoare <= p) {
                xPlusYLimitedByP.add(valoare);
            }
        }
        IO.println("d) xPlusYLimitedByP (<= " + p + "): " + xPlusYLimitedByP);

        IO.println();

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student(112, "Ioan", "Popa", "TI21/1"));
        listaStudenti.add(new Student(112, "Maria", "Oprea", "TI21/1"));
        listaStudenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
        listaStudenti.add(new Student(122, "Mihai", "Vecerdea", "TI22/1"));
        listaStudenti.add(new Student(122, "Eugen", "Uritescu", "TI22/2"));

        IO.println("Continutul listei: ");
        IO.println();
        for (Student s : listaStudenti) {
            IO.println(s);
        }
        IO.println();

        Student StudentCautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        Student StudentCautat2 = new Student(112, "Maria", "Popa", "TI21/1");

        IO.println("Cautare liniara:");
        IO.println();
        IO.println("Exista Alis Popa? " + cautareLiniara(listaStudenti, StudentCautat1));
        IO.println("Exista Maria Popa? " + cautareLiniara(listaStudenti, StudentCautat2));
        IO.println();

        IO.println("Cautare cu HashSet, complexitate 0(1):");
        IO.println();

        Set<Student> setStudenti = new HashSet<>(listaStudenti);

        IO.println("Exista Alis Popa? " + cautareRapidaO1(setStudenti, StudentCautat1));
        IO.println("Exista Maria Popa? " + cautareRapidaO1(setStudenti, StudentCautat2));
        IO.println();
    }

    //Cautare liniara
    public static boolean cautareLiniara(List<Student> lista, Student cautat) {
        for (Student s : lista) {
            if (s.getPrenume().equals(cautat.getPrenume()) && s.getNume().equals(cautat.getNume()) && s.getFormatieDeStudiu().equals(cautat.getFormatieDeStudiu())) {
                return true;
            }
        }
        return false;
    }

    // COMPLEXITATE 0(1)
    public static boolean cautareRapidaO1(Set<Student> setStudenti, Student cautat) {

        return setStudenti.contains(cautat);
    }

}
