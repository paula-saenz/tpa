import java.util.LinkedList;

/**
 * @author1 Sáenz de Santa María Diez, Paula
 * @expediente1 21842142
 *
 * @author2 Ramos García, Andres
 * @expediente2 22039668
 *
 * @date 2024-05-17
 * @version 0.1
 */

//imports aquí

public class Pruebas {
    //CREAR ARBOL
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

    private static Arbol_N<Integer> formarArbolABB1() {
        Arbol_N<Integer> h = new Arbol_N<>();
        Arbol_N<Integer> g = new Arbol_N(76, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> f = new Arbol_N(25, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> e = new Arbol_N(5, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> d = new Arbol_N(15, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> c = new Arbol_N(30, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> b = new Arbol_N(10, new LinkedList<Arbol_N.Nodo>());
        Arbol_N<Integer> a = new Arbol_N(20, new LinkedList<Arbol_N.Nodo>());

        a.getHijos().add(h);
        a.getHijos().add(c);

        //b.getHijos().add(e);
        //b.getHijos().add(d);

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


    public static boolean esABB(Arbol_N<Integer> arbol) {
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

                    esABBParteIzquierda =
                        esABB_aux(arbol.getHijoN(1), arbol.getRaiz(), true) 
                        &&  esABB(arbol.getHijoN(1));
                }

                // Recorre la parte derecha del árbol
                if (arbol.getNumHijos() > 1 && !arbol.getHijoN(2).esVacio()) {

                    esABBParteDerecha =
                        esABB_aux(arbol.getHijoN(2), arbol.getRaiz(), false)
                        && esABB(arbol.getHijoN(2));
                }

                /*
                El árbol es un ABB si tanto la parte 
                izquierda como la derecha son ABB
                 */
                return esABBParteIzquierda && esABBParteDerecha;
            }
        }
    } //Función esABB

    // Método para verificar si un subárbol cumple con las propiedades de un ABB
    private static boolean esABB_aux(Arbol_N<Integer> arbol, int numero, boolean subarbol) {
        //vamos por el izquierdo y si la raiz actual es mayor que el padre, no es abbx
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


    public static <T extends Number> boolean sonIguales(Arbol_N<T> arbol, Arbol_N<T> arbol1) {

        if (!arbol.esVacio() && !arbol1.esVacio()) {
            int cont = 1;
            boolean ig = true;

            if (arbol.getNumHijos() == arbol1.getNumHijos() 
                && arbol.getRaiz() == arbol1.getRaiz()) {

                while (cont <= arbol.getNumHijos() && ig == true) {
                    ig =  sonIguales(arbol.getHijoN(cont), 
                                     arbol1.getHijoN(cont));
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


    //funcion es AVL
    public static boolean esAVL (Arbol_N<Integer> a){
        if(esABB(a)){
            int profundidad = profundidad(a);
            if (profundidad == 0){ //si devuelve 0 esta desequilibrado
                return false;
            } else {
                return true;
            }
        } else{
            return false;
        }
    }


    public static int profundidad (Arbol_N<Integer> a){
        if (a.esVacio()){ // 
            return 0;
        } else {
            int profundidadIzq = 0;
            int profundidadDer = 0;
    
            //mira el hijo 
            if (a.getNumHijos() >= 1) {
                profundidadIzq = profundidad(a.getHijoN(1));
            }
            // mira el segundo hijo si lo tiene
            if (a.getNumHijos() == 2) {
                profundidadDer = profundidad(a.getHijoN(2));
            }
    
            if (Math.abs(profundidadIzq - profundidadDer) > 1) {
                return 0;
            }
    
            return Math.max(profundidadIzq, profundidadDer) + 1;
        }
            
        }

        // * arbolN y un dato, en que nivel esta ese dato y si esta

        public static int que_nivelX (Arbol_N<Integer> a, int x){
            if(a.esVacio()){
                return 0;
            } else{
                //ir bajando por niveles y comparar el numero
                if(a.getRaiz()==x){
                    return 1;
                }
                int nivel = nivelito(a, x, 1);//empezamos en nivel 1
                if (nivel ==0){
                    return 0;
                } else{
                    return nivel+1;

                }
            }

        }

        public static int nivelito (Arbol_N<Integer> a, int x, int nivel){
            if(a.esVacio()){
                return 0;
            } else{
                int i = 1;
                if (a.getHijoN(i).getRaiz() == x) {
                    return nivel + 1; 
                }
                while (i <= a.getNumHijos()) {
                    int nivelEncontrado = nivelito(a.getHijoN(i), x, nivel + 1);
                    if (nivelEncontrado != 0) {
                        return nivelEncontrado; 
                    }
                 i++; 
                }
                return 0; 
            }
            
        }
        


    public static void main(String[] args) {

        // llamada a arboles para su creacion
        Arbol_N<Integer> arbol_N = formarArbol();
        Arbol_N<Integer> arbol_N1 = formarArbol();
        Arbol_N<Integer> arbol_N2 = formarArbol1();
        Arbol_N<Integer> arbol_ABB = formarArbolABB();
        Arbol_N<Integer> arbol_ABB1 = formarArbolABB1();

        // pruebas

        /*System.out.println("------------------------- PRUEBAS DE GRADO ARBOL: --------------------------");
        System.out.print("Grado Arbol_N1:");
        System.out.println(gradoArbol(arbol_N));
        System.out.print("Grado Arbol_N2:");
        System.out.println(gradoArbol(arbol_N2));
        System.out.print("Grado Arbol_ABB: ");
        System.out.println(gradoArbol(arbol_ABB));
        System.out.println();
        System.out.println();*/

        System.out.println("------------------------ PRUEBAS DE ARBOL BINARIO DE BUSQUEDA: ----------------------------");
        System.out.print("¿Es el Arbol_N1 binario de busqueda?: ");
        System.out.println(esABB(arbol_N));
        System.out.print("¿Es el Arbol_N1 binario de busqueda?: ");
        System.out.println(esABB(arbol_N1));
        System.out.print("¿Es el Arbol_N2 binario de busqueda?: ");
        System.out.println(esABB(arbol_N2));
        System.out.print("¿Es el Arbol_ABB binario de busqueda?: ");
        System.out.println(esABB(arbol_ABB));
        System.out.print("¿Es el Arbol_ABB1 binario de busqueda?: ");
        System.out.println(esABB(arbol_ABB1));
        System.out.println();
        System.out.println();
        System.out.print("¿Es el Arbol_ABB1 AVL?: ");
        System.out.println((esAVL(arbol_ABB1)));
        System.out.println();
        System.out.println();
        System.out.print("¿En que nivel esta el numero?: ");
        System.out.println((que_nivelX(arbol_ABB1,30)));
        System.out.println();
        System.out.println();


        /*System.out.println("------------------------ PRUEBAS DE ARBOL IGUALES: ----------------------------");
        System.out.print("¿Es el Arbol_N2 igual al Arbol_N1?: ");
        System.out.println(sonIguales(arbol_N2,arbol_N1));
        System.out.print("¿Es el Arbol_N1 igual al Arbol_N1?: ");
        System.out.println(sonIguales(arbol_N,arbol_N1));
        System.out.print("¿Es el Arbol_N1 igual al Arbol_ABB?: ");
        System.out.println(sonIguales(arbol_N,arbol_ABB));
        System.out.print("¿Es el Arbol_ABB igual al Arbol_ABB1?: ");
        System.out.println(sonIguales(arbol_ABB,arbol_ABB1));*/






    }//main



}//Clase Pruebas_3




