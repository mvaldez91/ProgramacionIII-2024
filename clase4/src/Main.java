//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //int valor = 10;
        //Integer valor = 10;
        List<String> nombres = new ArrayList<String>();
        //Agregar
        nombres.add("Juan");
        nombres.add("Cesar");
        nombres.add("Marta");
        //Lectura completa
        for (int i=0; i< nombres.size(); i++ ){
            System.out.println(nombres.get(i));
        }

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Nissan");

//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }

    }
}