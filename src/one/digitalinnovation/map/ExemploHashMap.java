package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais no nosso mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundialFifa.remove("França");
        System.out.println(campeoesMundialFifa);

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe ou não algum país hexa campeão
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());
        System.out.println(campeoesMundialFifa);

        //Navegando
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()){
            System.out.println("País: "+key+" --- "+campeoesMundialFifa.get(key));
        }

    }

}
