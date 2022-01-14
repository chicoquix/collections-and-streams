package one.digitalinnovation.set;

import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(Integer numero : numeros){
            System.out.println(numero);
        }

        numeros.remove(3);
        System.out.println(numeros);

        numeros.add(23);
        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());

    }

}
