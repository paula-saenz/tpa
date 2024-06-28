import java.util.LinkedList;

/**
 *
 * @author1 Ramos García, Andres
 * @expediente1 22039668
 *
 * @author2 Sáenz de Santa María Diez, Paula
 * @expediente2 21842142
 *
 * @date 2024-05-10
 * @version 0.1
 */



/**
 * Esta clase representa un árbol de grado N.
 */
public class Arbol_N<T>{
    class Nodo {
        T info;
        LinkedList<Arbol_N<T>> hijos;

        Nodo(T infito ,LinkedList<Arbol_N<T>> hijitos){
            this.info = infito;
            this.hijos = hijitos;
        }
    }

    /**
     * creacion de la raiz del arbol
     */
    private Nodo raiz;

    /**
     * Constructor por defecto que inicializa el árbol como vacío.
     */

    public Arbol_N(){raiz = null;}

    /**
     * Constructor por parámetros:
     * @param info Dato que insertaremos en la raíz del nodo
     * @param hijos Lista con los hijos del nodo raíz del árbol que
     * estamos creando.
     */

    public Arbol_N(T info, LinkedList<Arbol_N<T>> hijos ){
        this.raiz = new Nodo(info, hijos);
    }

    /**
     * Verifica si el árbol está vacío.
     * @return True si el árbol está vacío, False de lo contrario.
     */

    public boolean esVacio() {return raiz == null;}

    /**
     * Obtiene el dato almacenado en la raíz del árbol.
     * @return El dato almacenado en la raíz.
     */

    public T getRaiz() { return this.raiz.info; }

    /**
     * Obtiene el número de hijos del nodo raíz.
     * @return El número de hijos del nodo raíz.
     */

    public int getNumHijos(){
        return this.raiz.hijos.size();
    }

    /**
     * Obtiene la lista de hijos del nodo raíz.
     * @return La lista de hijos del nodo raíz.
     */

    public LinkedList<Arbol_N<T>> getHijos(){
        return this.raiz.hijos;
    }

    /**
     * Obtiene el sub-arbol en la posición especificada del nodo.
     * @param nodo La posición del sub-arbol a obtener.
     * @return El sub-arbol en la posición especificada.
     */
    public Arbol_N<T> getHijoN (int nodo){
        return getHijos().get(nodo-1);
    }

} // Clase Arbol_N