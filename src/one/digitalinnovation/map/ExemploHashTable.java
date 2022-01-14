package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //Atualiza valor da chave
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        //Remove um estudante no índice 1
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //Recupera um estudante no índice 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);
        System.out.println(estudantes);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey()+" | Idade: "+entry.getValue());
        }

    }

}
