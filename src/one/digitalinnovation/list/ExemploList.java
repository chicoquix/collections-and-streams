package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        //Instânciando List
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2, "Larissa");

        System.out.println(nomes);
        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

//        nomes.clear();
//
//        listaEstaVazia = nomes.isEmpty();
//
//        System.out.println(listaEstaVazia);

           int posicao = nomes.indexOf("Carlos");

           System.out.println(posicao);

           for(String nomeItem : nomes){
               System.out.println(nomeItem);
           }

           Iterator<String> iterator = nomes.iterator();

           while(iterator.hasNext()){

               System.out.println("--------> "+iterator.next());

           }


    }

}
