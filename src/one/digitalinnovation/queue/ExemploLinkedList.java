package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Atende o primeiro cliente
        String ClienteASerAtendido = filaBanco.poll();
        System.out.println(ClienteASerAtendido);
        System.out.println(filaBanco);

        //Exibe o primeiro cliente
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //A diferença entre peek e element é que element acusa o erro, parando o código e peek exibe null
        Queue<String> filaVazia = new LinkedList<>();
        String primeiroClienteOuErro;
        System.out.println("element:");
        //primeiroClienteOuErro = filaVazia.element();
        //System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
        System.out.println("");
        System.out.println("peek:");
        primeiroClienteOuErro = filaVazia.peek();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaVazia);

        //Navegando na queue
        for (String cliente : filaBanco){
            System.out.println(cliente);
        }

        //Navegando com while
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext())
        System.out.println("-----> "+iteratorFilaBanco.next());

    }

}
