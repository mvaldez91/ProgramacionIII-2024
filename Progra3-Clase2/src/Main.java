import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Nodo nodo = new Nodo(1, null);
        //System.out.printf(String.valueOf(nodo.getDato()));

        ListaSimple listaSimplementeEnlazada = new ListaSimple(nodo);
        listaSimplementeEnlazada.AgregarCabeza(3);
        listaSimplementeEnlazada.AgregarCabeza(4);
        listaSimplementeEnlazada.AgregarAlFinal(10);
        listaSimplementeEnlazada.ImprimirElementos();
        //Colecciones();
    }

    public static void Colecciones(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(4);
        lista.add(60);
        lista.add(1);
        lista.add(10);
        for (int i = 0; i < lista.size() ; i++){
            System.out.println(lista.get(i));
        }
        Collections.sort(lista);
        System.out.println("Ordenada");
        for (int i = 0; i < lista.size() ; i++){
            System.out.println(lista.get(i));
        }

    }
}