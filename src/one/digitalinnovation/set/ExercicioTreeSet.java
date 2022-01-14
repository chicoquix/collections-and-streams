package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExercicioTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);
        }

        numeros.pollFirst();
        System.out.println(numeros);

        numeros.add(23);
        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());

    }

}
