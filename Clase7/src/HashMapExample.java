import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void doExample() {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Pedro", 28);

        int juanAge = hashMap.get("Juan");
        System.out.println("La edad de Juan es: " + juanAge);

        boolean mariaExists = hashMap.containsKey("María");
        System.out.println("¿María existe en el HashMap? " + mariaExists);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }

        hashMap.remove("Pedro");
        System.out.println("Después de remover a Pedro: " + hashMap);
    }
}
