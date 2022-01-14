package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioLinkedList {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        for (String nome : fila){
            System.out.println(nome);
        }

        System.out.println(fila.peek());

        System.out.println(fila.poll());

        fila.add("Daniel");

        System.out.println(fila);

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());

        System.out.println(fila.contains("Carlos"));
    }

}
