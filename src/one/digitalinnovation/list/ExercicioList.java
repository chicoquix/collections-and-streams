package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) System.out.println(nome);

        nomes.set(2, "Roberto");

        System.out.println(nomes);

        System.out.println(nomes.get(0));

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("João");

        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomesNew = new ArrayList<>();

        nomesNew.add("Ismael");
        nomesNew.add("Rodrigo");

        System.out.println(nomes);
        System.out.println(nomesNew);

        nomes.addAll(nomesNew);

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.isEmpty());


    }
}
