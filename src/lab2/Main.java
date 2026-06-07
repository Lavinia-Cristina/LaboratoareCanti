package lab2;

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
        IO.println("a) xPlusY:" + xPlusY);

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
    }
}