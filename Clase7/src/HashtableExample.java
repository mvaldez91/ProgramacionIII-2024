import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void doExample() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Juan", 25);
        hashtable.put("María", 30);
        hashtable.put("Pedro", 28);

        int juanAge = hashtable.get("Juan");
        System.out.println("La edad de Juan es: " + juanAge);

        boolean mariaExists = hashtable.containsKey("María");
        System.out.println("¿María existe en el Hashtable? " + mariaExists);

        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }

        hashtable.remove("Pedro");
        System.out.println("Después de remover a Pedro: " + hashtable);
    }
}
