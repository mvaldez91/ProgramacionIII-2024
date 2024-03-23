import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorExample {
    public static void doExample() {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        Enumeration<String> enumerator = vector.elements();

        while (enumerator.hasMoreElements()) {
            String element = enumerator.nextElement();
            System.out.println(element);
        }
    }
}