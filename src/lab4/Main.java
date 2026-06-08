package lab4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu", "Maria", "Bucuresti", "Victor", "Cluj",
                "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie",
                "Daniela", "Sibiu"
        );

        IO.println("Afisarea, adaugarea si reafisarea:");
        IO.println();

        for (Map.Entry<String, Integer> entry : varste.entrySet()) {
            IO.println(entry.getKey() + " are " + entry.getValue() + " ani");
        }

        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        IO.println();

        IO.println("Dupa adaugarea lui Vlad si Iulia:");
        IO.println();
        for (Map.Entry<String, Integer> entry : varste.entrySet()) {
            IO.println(entry.getKey() + " are " + entry.getValue() + " ani");
        }


        HashMap<String, Tanar> tineri = new HashMap<>();


        for (Map.Entry<String, Integer> entry : varste.entrySet()) {
            String nume = entry.getKey();
            int varsta = entry.getValue();

            String adresa = adrese.getOrDefault(nume, "Necunoscuta");

            Tanar tanarNou = new Tanar(nume, varsta, adresa);
            tineri.put(nume, tanarNou);
        }
        IO.println();

        IO.println("Continutul final:");
        IO.println();
        for (Map.Entry<String, Tanar> entry : tineri.entrySet()) {
            IO.println(entry.getValue());
        }
    }
}