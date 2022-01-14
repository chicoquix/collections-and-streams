package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        //Instânciando Vector
        List<String> esportes = new Vector<>();

        //Adicionando 4 esportes
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        //Alterando valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        //Removendo esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);

        //Removendo esporte Handebol
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retornando o primeiro item do vetor
        System.out.println(esportes.get(0));


        //Exibindo esportes do vetor
        for(String esporte : esportes){
            System.out.println(esporte);
        }



    }

}
