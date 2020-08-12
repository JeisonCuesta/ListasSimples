public class Listas {

    public static void main(String[] args) {

        ListaSimple ls = new ListaSimple();
        
        System.out.println("Mostrar Lista Inicialmente:");
        ls.mostrarlista();
        
        System.out.println("\n LLenando lista...");
        ls.insertar(1);
        ls.insertar(2);
        ls.insertar(3);
        ls.insertar(4);
        ls.insertar(5);
        System.out.println("\n Mostrar Lista Nuevamente Despues de Llenar:");
        ls.mostrarlista();
        
        System.out.println("\n Vaciando Lista");
        ls.vaciar();
        System.out.println("\n Mostrar Lista Nuevamente Despues de Vaciar");
        ls.mostrarlista();    
    }
}

class nodo {
    
    private int dato;
    private nodo siguiente;

    public nodo(int dato) {
        this.dato = dato;
    }

    public nodo(int dato, nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
}

class ListaSimple {

    private nodo inicio;
    private nodo ultimo;
    private int tamanio;

    public ListaSimple() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public nodo getInicio() {
        return inicio;
    }

    public nodo getUltimo() {
        return ultimo;
    }

    public void setInicio(nodo inicio) {
        this.inicio = inicio;
    }

    public void setUltimo(nodo ultimo) {
        this.ultimo = ultimo;
    }

    public boolean Vacio() {
        return inicio == null;
    }

    public void insertar(int d) {
        nodo nuevo = new nodo(d, inicio);
        inicio = nuevo;
        if (ultimo == null) {
            ultimo = inicio;
        }
        tamanio++;
    }

    public String Mostrar() {
        String lista = "";
        nodo auxiliar = inicio;       
        while (auxiliar != null) {
            lista += auxiliar.getDato() + " ";
            auxiliar = auxiliar.getSiguiente();         
        }
        return lista;
    }
    
    public void mostrarlista() {
        int contador = 0;
        String mostrar = " ";
        nodo aux = inicio;
        if (Vacio()) {
            System.out.println("¡¡¡LA LISTA ESTA VACIA!!!");
        } else {
            while (aux != null) {
                mostrar += "  " + aux.getDato();
                contador++;
                aux = aux.getSiguiente();
            }
            System.out.println("Lista: " + mostrar + "\n --EL TAMAÑO DE LA LISTA ES: (" + contador + ") ELEMENTOS");
        }
    }
    
    public void vaciar(){
        inicio = null;
    }

    @Override
    public String toString() {
        return "ListaSimple{" + "inicio=" + inicio + ", ultimo=" + ultimo + '}';
    }   
}

