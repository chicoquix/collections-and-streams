package one.digitalinnovation.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioLinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<String, String> brasilEstados = new LinkedHashMap<>();

        brasilEstados.put("AC", "Acre");
        brasilEstados.put("AL", "Alagoas");
        brasilEstados.put("AP", "Amapá");
        brasilEstados.put("AM", "Amazonas");
        brasilEstados.put("BH", "Bahia");
        brasilEstados.put("CE", "Ceará");
        brasilEstados.put("ES", "Espírito Santo");
        brasilEstados.put("GO", "Goiás");
        brasilEstados.put("MA", "Maranhão");
        brasilEstados.put("MT", "Mato Grosso");
        brasilEstados.put("MS", "Mato Grosso do Sul");
        brasilEstados.put("MG", "Minas Gerais");
        brasilEstados.put("PA", "Pará");
        brasilEstados.put("PB", "Paraíba");
        brasilEstados.put("PR", "Paraná");
        brasilEstados.put("PE", "Pernambuco");
        brasilEstados.put("PI", "Piauí");
        brasilEstados.put("RJ", "Rio de Janeiro");
        brasilEstados.put("RN", "Rio Grande do Norte");
        brasilEstados.put("RS", "Rio Grande do Sul");
        brasilEstados.put("RO", "Rondônia");
        brasilEstados.put("RR","Roraima");
        brasilEstados.put("SC", "Santa Catarina");
        brasilEstados.put("SP", "São Paulo");
        brasilEstados.put("SE", "Sergipe");
        brasilEstados.put("TO", "Tocantins");

        System.out.println(brasilEstados);

        brasilEstados.remove("MG");
        System.out.println(brasilEstados);

        brasilEstados.put("DF", "Distrito Federal");
        System.out.println(brasilEstados);

        System.out.println(brasilEstados.size());

        brasilEstados.remove("MS");
        System.out.println(brasilEstados);

        for (Map.Entry<String, String> entry : brasilEstados.entrySet()){
            System.out.println(entry.getValue()+"("+ entry.getKey()+")");
        }

        System.out.println(brasilEstados.containsKey("SC"));

        System.out.println(brasilEstados.containsValue("Maranhão"));

    }

}
