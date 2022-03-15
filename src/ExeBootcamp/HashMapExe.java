package ExeBootcamp;

import java.util.HashMap;

public class HashMapExe {
    public static void main(String[] args) {
        java.util.HashMap<String, String> Cities = new java.util.HashMap<String, String>();

        Cities.put("Londres ", "-2, 33");
        Cities.put("Madrid ", "-3, 32");
        Cities.put("Nueva York ", "-8, 27");
        Cities.put("Buenos Aires ", "4, 37");
        Cities.put("Asuncion ", "6, 42");
        Cities.put("Sao Paulo ", "5, 43");
        Cities.put("Lima ", "0, 39");
        Cities.put("Santiago de Chile ", "-7, 26");
        Cities.put("Lisboa ", "-1, 31");
        Cities.put("Tokio ", "-10, 35");

        System.out.println("Cidades e suas temperaturas minimas e maximas correspondentes");

        for (String i : Cities.keySet()) {

            System.out.println("Cidade: " + i + " temperatura: " + Cities.get(i));
        }

    }
}
