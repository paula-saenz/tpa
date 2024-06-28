import java.util.LinkedList;

/**
 *
 * @author1 Ramos García, Andres
 * @expediente1 22039668
 *
 * @author2 Sáenz de Santa María Diez, Paula
 * @expediente2 21842142
 *
 * @date 2024-05-17
 * @version 0.1
 */

//imports aquí

public class Pruebas {
    
    /**
     * Creamos un árbol general para llevar a cabo pruebas con las funciones
     * @return el arbol
     */
    private static Arbol_N<Integer> formarArbol() {
        Arbol_N<Integer> n = new Arbol_N(18, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> m = new Arbol_N(17, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> l = new Arbol_N(16, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> k = new Arbol_N(15, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> j = new Arbol_N(14, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> ii = new Arbol_N(13, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> h = new Arbol_N(12, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> g = new Arbol_N(11, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> f = new Arbol_N(10, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> e = new Arbol_N(9, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> d = new Arbol_N(8, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> c = new Arbol_N(7, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> b = new Arbol_N(6, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> a = new Arbol_N(5, new LinkedList<Arbol_N.Nodo>());

        a.getHijos().add(b);
        a.getHijos().add(c);
        a.getHijos().add(d);

        b.getHijos().add(e);
        b.getHijos().add(f);
        b.getHijos().add(g);
        b.getHijos().add(h);

        e.getHijos().add(ii);
        e.getHijos().add(j);
        e.getHijos().add(k);

        ii.getHijos().add(l);

        j.getHijos().add(m);
        j.getHijos().add(n);

        /* EJEMPLO:
         * 			   -------- 5 -------
         *			  |	        |        |
         * 			  6		    7        8
         * 		   / | | \
         * 		  9 10 11 12
         *      / | \
         *     13 14 15
         *    /  / |
         *  16  17 18
         */


        return a;
    } //Funcion arbol 1

    /**
     * Creamos un árbol general para llevar a cabo pruebas con las funciones
     * @return el arbol
     */
    private static Arbol_N<Integer> formarArbol1() {
        Arbol_N<Integer> n = new Arbol_N(19, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> m = new Arbol_N(17, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> l = new Arbol_N(16, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> k = new Arbol_N(15, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> j = new Arbol_N(14, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> ii = new Arbol_N(13, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> h = new Arbol_N(12, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> g = new Arbol_N(11, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> f = new Arbol_N(10, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> e = new Arbol_N(9, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> d = new Arbol_N(8, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> c = new Arbol_N(7, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> b = new Arbol_N(6, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> a = new Arbol_N(5, new LinkedList<Arbol_N.Nodo>());

        a.getHijos().add(b);
        a.getHijos().add(c);
        a.getHijos().add(d);

        b.getHijos().add(e);
        b.getHijos().add(f);
        b.getHijos().add(g);
        b.getHijos().add(h);

        e.getHijos().add(ii);
        e.getHijos().add(j);
        e.getHijos().add(k);

        ii.getHijos().add(l);

        j.getHijos().add(m);
        j.getHijos().add(n);

        return a;

        /* EJEMPLO:
         * 			   -------- 5 -------
         *			  |	        |        |
         * 			  6		    7        8
         * 		   / | | \
         * 		  9 10 11 12
         *      / | \
         *     13 14 15
         *    /  / |
         *  16  17 19
         */
    } //Funcion arbol 2

    /**
     * Creamos un árbol general para llevar a cabo pruebas con las funciones
     * @return el arbol
     */
    private static Arbol_N<Integer> formarArbolABB() {
        Arbol_N<Integer> j = new Arbol_N(13, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> h = new Arbol_N(16, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> g = new Arbol_N(25, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> f = new Arbol_N(75, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> e = new Arbol_N(5, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> d = new Arbol_N(15, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> c = new Arbol_N(30, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> b = new Arbol_N(10, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> a = new Arbol_N(20, new LinkedList<Arbol_N.Nodo>());

        a.getHijos().add(b);
        a.getHijos().add(c);

        b.getHijos().add(e);
        b.getHijos().add(d);


        c.getHijos().add(g);
        c.getHijos().add(f);



        d.getHijos().add(h);


        h.getHijos().add(j);

        return a;

        /* EJEMPLO: ahora no es ABB
         * 			   -------- a:20 -------
         *			         /      \
         * 			       b: 10    c: 30
         *                 /  \     /  \
         *              e:5  d:15 g:25  f:75
                               /
                             h:16
                             /
                           j:13
         * */
    } //Funcion arbol ABB

    /**
     * Creamos un árbol general para llevar a cabo pruebas con las funciones
     * @return el arbol
     */
    private static Arbol_N<Integer> formarArbolABB1() {
        Arbol_N<Integer> g = new Arbol_N(75, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> f = new Arbol_N(25, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> e = new Arbol_N(5, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> d = new Arbol_N(15, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> c = new Arbol_N(30, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> b = new Arbol_N(10, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> a = new Arbol_N(20, new LinkedList<Arbol_N.Nodo>());

        a.getHijos().add(b);
        a.getHijos().add(c);

        b.getHijos().add(e);
        b.getHijos().add(d);

        c.getHijos().add(f);
        c.getHijos().add(g);

        return a;

        /* EJEMPLO:
         * 			   -------- 20 -------
         *			         /      \
         * 			        10       30
         *                 /  \     /  \
         *                5   15   25   76

         */
    } //Funcion arbol ABB1

    /**
     * Calcula el grado de un árbol (número máximo de hijos que tiene algún nodo del árbol).
     * @param <T> El tipo de dato contenido en los nodos del árbol.
     * @param arbol El árbol del que se quiere calcular el grado.
     * @return Un entero que representa el grado del árbol.
     */
    public static <T extends Number> int gradoArbol(Arbol_N<T> arbol) {
        if (!arbol.esVacio()) {
            int grado = arbol.getNumHijos();
            for (int i = 1; i <= arbol.getNumHijos(); i++) {
                int gradoHijo = gradoArbol(arbol.getHijoN(i));
                if (gradoHijo > grado) {
                    grado = gradoHijo;
                }
            }
            return grado;
        } else {
            return 0;
        }
    } // Función gradoArbol

    /**
     * Verifica si un árbol es un árbol binario de búsqueda (ABB).
     * @param arbol El árbol que se quiere verificar.
     * @return true si el árbol es un ABB, false en caso contrario.
     */
    private static boolean esABB(Arbol_N<Integer> arbol) {
        if (arbol.esVacio()) {
            // Árbol vacío, considerado ABB
            return true;
        } else{
            //si el arbol tiene mas de dos hijos, no es ABB
            if (arbol.getNumHijos()>2){
                return false;
            } else{
                // creamos las variables de comprobacion
                boolean esABBParteIzquierda = true;
                boolean esABBParteDerecha = true;

                // Recorre la parte izquierda del árbol
                if (arbol.getNumHijos() > 0 && !arbol.getHijoN(1).esVacio()) {

                    esABBParteIzquierda =   esABB_aux(arbol.getHijoN(1), arbol.getRaiz(), true) &&
                                            esABB(arbol.getHijoN(1));
                }

                // Recorre la parte derecha del árbol
                if (arbol.getNumHijos() > 1 && !arbol.getHijoN(2).esVacio()) {

                    esABBParteDerecha =     esABB_aux(arbol.getHijoN(2), arbol.getRaiz(), false) &&
                                            esABB(arbol.getHijoN(2));
                }

                // El árbol es un ABB si tanto la parte izquierda como la derecha son ABB
                return esABBParteIzquierda && esABBParteDerecha;
            }

        }

    } //Función esABB

    /**
     * Función auxiliar para verificar si los subárboles cumplen con las propiedades de un ABB.
     * @param arbol El subárbol que se quiere verificar.
     * @param numero El valor del nodo padre del subárbol.
     * @param subarbol Un booleano que indica si se está verificando el subárbol izquierdo (true) 
     * o el derecho (false).
     * @return true si el subárbol cumple con las propiedades de un ABB, false en caso contrario.
     */
    private static boolean esABB_aux(Arbol_N<Integer> arbol, int numero, boolean subarbol) {
        if (subarbol && arbol.getRaiz() >= numero) {
            return false;
        } else if (!subarbol && arbol.getRaiz() <= numero) {
            return false;
        } else {
            boolean entrar = true;
            int i=1;
            while(i<= arbol.getNumHijos() && entrar){
                if (!esABB_aux(arbol.getHijoN(i), numero, subarbol)) {
                    // Si algún hijo no cumple la condición
                    entrar = false;
                }
                i++;
            }
            return entrar;
        }
    } //Función esABB_aux

    /**
     * Compara dos árboles y verifica si son iguales en estructura y contenido.
     * 
     * @param <T> El tipo de dato contenido en los nodos de los árboles.
     * @param arbol El primer árbol a comparar.
     * @param arbol1 El segundo árbol a comparar.
     * @return true si los árboles son iguales, false en caso contrario.
     */
    public static <T extends Number> boolean sonIguales(Arbol_N<T> arbol, Arbol_N<T> arbol1) {

        if (!arbol.esVacio() && !arbol1.esVacio()) {
            int cont = 1;
            boolean ig = true;

            if (arbol.getNumHijos() == arbol1.getNumHijos() && arbol.getRaiz() == arbol1.getRaiz()) {
                while (cont <= arbol.getNumHijos() && ig == true) {
                    ig =  sonIguales(arbol.getHijoN(cont), arbol1.getHijoN(cont));
                    cont++;
                }
                return ig;

            }else{
                return false;
            }

        } else if (!arbol.esVacio() || !arbol1.esVacio()) {
            return false;
        } else {
            return true;
        }
    } //Función sonIguales


    public static void main(String[] args) {

        // llamada a arboles para su creacion
        Arbol_N<Integer> arbol_N = formarArbol();
        Arbol_N<Integer> arbol_N1 = formarArbol();

        Arbol_N<Integer> arbol_N2 = formarArbol1();

        Arbol_N<Integer> arbol_ABB = formarArbolABB();
        
        Arbol_N<Integer> arbol_ABB1 = formarArbolABB1();

        // pruebas
        System.out.println("------------------------- PRUEBAS DE GRADO ARBOL: --------------------------");
        System.out.print("Grado Arbol_N:");
        System.out.println(gradoArbol(arbol_N));
        System.out.print("Grado Arbol_N2:");
        System.out.println(gradoArbol(arbol_N2));
        System.out.print("Grado Arbol_ABB: ");
        System.out.println(gradoArbol(arbol_ABB));
        System.out.println();
        System.out.println();

        System.out.println("------------------------ PRUEBAS DE ARBOL BINARIO DE BUSQUEDA: ----------------------------");
        System.out.print("¿Es el Arbol_N binario de busqueda?: ");
        System.out.println(esABB(arbol_N));
        System.out.print("¿Es el Arbol_N binario de busqueda?: ");
        System.out.println(esABB(arbol_N1));
        System.out.print("¿Es el Arbol_N2 binario de busqueda?: ");
        System.out.println(esABB(arbol_N2));
        System.out.print("¿Es el Arbol_ABB binario de busqueda?: ");
        System.out.println(esABB(arbol_ABB));
        System.out.print("¿Es el Arbol_ABB1 binario de busqueda?: ");
        System.out.println(esABB(arbol_ABB1));
        System.out.println();
        System.out.println();


        System.out.println("------------------------ PRUEBAS DE ARBOL IGUALES: ----------------------------");
        System.out.print("¿Es el Arbol_N2 igual al Arbol_N1?: ");
        System.out.println(sonIguales(arbol_N2,arbol_N1));
        System.out.print("¿Es el Arbol_N igual al Arbol_N1?: ");
        System.out.println(sonIguales(arbol_N,arbol_N1));
        System.out.print("¿Es el Arbol_N igual al Arbol_ABB?: ");
        System.out.println(sonIguales(arbol_N,arbol_ABB));
        System.out.print("¿Es el Arbol_ABB igual al Arbol_ABB1?: ");
        System.out.println(sonIguales(arbol_ABB,arbol_ABB1));
    }//main
}//Clase Pruebas




