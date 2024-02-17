public class ListaSimple {
    //Primer elemento
    private Nodo cabeza;
    private int tamanio;

    public ListaSimple(Nodo cabeza){
        this.cabeza = cabeza;
    }
    public void AgregarCabeza(int dato){
        Nodo nuevo = new Nodo(dato, cabeza);
        cabeza = nuevo;
    }

    public void AgregarAlFinal(int dato){
        Nodo nuevo = new Nodo(dato, null);
        Nodo nodoActual = cabeza;
        Nodo nodoAuxiliar = null;
        while (nodoActual != null){
            nodoAuxiliar = nodoActual;
            nodoActual = nodoActual.getEnlace();
        }
        if (nodoAuxiliar != null){
            nodoAuxiliar.CambiarEnlace(nuevo);
        }

    }


    public void ImprimirElementos(){
        Nodo nodoActual = cabeza;
        while (nodoActual != null){
            System.out.println( String.format("Dato %s", nodoActual.getDato()));
            nodoActual = nodoActual.getEnlace();
        }
    }
}
