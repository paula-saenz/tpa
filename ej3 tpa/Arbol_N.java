import java.util.LinkedList;
import java.util.Vector;

/**
 * @author1 Sáenz de Santa María Diez, Paula
 * @expediente1 21842142
 *
 * @author2 Ramos García, Andres
 * @expediente2 22039668
 *
 * @date 2024-05-10
 * @version 0.1
 */

/**
 * Comentario Javadoc de Clase
 *
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

    public static class ejemplos {
       public static int numero_nodos_hoja(ArbolBin<Integer> var0) {
          if (!var0.esVacio()) {
             if (var0.hijoDerecho().esVacio() && var0.hijoIzquierdo().esVacio()) {
                return 1;
             } else {
                int var1 = numero_nodos_hoja(var0.hijoIzquierdo());
                int var2 = numero_nodos_hoja(var0.hijoDerecho());
                return var1 + var2;
             }
          } else {
             return 0;
          }
       }

       public static int numero_nodos(ArbolBin<Integer> var0) {
          if (!var0.esVacio()) {
             var0.raiz();
             int var1 = numero_nodos(var0.hijoIzquierdo());
             int var2 = numero_nodos(var0.hijoDerecho());
             return 1 + var1 + var2;
          } else {
             return 0;
          }
       }

       public static int profundidad(ArbolBin<Integer> var0) {
          if (!var0.esVacio()) {
             int var1 = profundidad(var0.hijoIzquierdo());
             int var2 = profundidad(var0.hijoDerecho());
             return var2 >= var1 ? 1 + var2 : 1 + var1;
          } else {
             return 0;
          }
       }

       public static boolean lleno(ArbolBin<Integer> var0) {
          if (!var0.esVacio()) {
             int var1 = (int)Math.pow(2.0D, (double)profundidad(var0)) - 1;
             int var2 = numero_nodos(var0);
             return var2 == var1;
          } else {
             return true;
          }
       }

       public static boolean iguales(ArbolBin<Integer> var0, ArbolBin<Integer> var1) {
          if (!var0.esVacio() && !var1.esVacio()) {
             if (var0.raiz() != var1.raiz()) {
                return false;
             } else {
                boolean var2 = iguales(var0.hijoIzquierdo(), var1.hijoIzquierdo());
                boolean var3 = iguales(var0.hijoDerecho(), var1.hijoDerecho());
                return var2 && var3;
             }
          } else {
             return true;
          }
       }

       public static void dibujar_nivel(ArbolBin<Integer> var0, int var1) {
          if (!var0.esVacio()) {
             if (var1 == 1) {
                System.out.println(var0.raiz());
             } else {
                dibujar_nivel(var0.hijoIzquierdo(), var1 - 1);
                dibujar_nivel(var0.hijoDerecho(), var1 - 1);
                System.out.println("*");
             }
          }

       }

       public static void dibujar_nivel1(ArbolBin<Integer> var0, int var1) {
          if (!var0.esVacio()) {
             dibujar_nivel1(var0.hijoIzquierdo(), var1 - 1);
             dibujar_nivel1(var0.hijoDerecho(), var1 - 1);
             System.out.println("*");
             if (var1 == 1) {
                System.out.println(var0.raiz());
             }
          }

       }

       public static boolean buscar_simple(ArbolBin<Integer> var0, int var1) {
          if (!var0.esVacio()) {
             System.out.println("*");
             if (var1 == (Integer)var0.raiz()) {
                return true;
             } else {
                boolean var2 = buscar_simple(var0.hijoIzquierdo(), var1);
                boolean var3 = buscar_simple(var0.hijoDerecho(), var1);
                return var2 || var3;
             }
          } else {
             return false;
          }
       }

       public static boolean buscar_ABB(ArbolBin<Integer> var0, int var1) {
          if (!var0.esVacio()) {
             System.out.println("*");
             if (var1 == (Integer)var0.raiz()) {
                return true;
             } else {
                boolean var2;
                if (var1 > (Integer)var0.raiz()) {
                   var2 = buscar_simple(var0.hijoDerecho(), var1);
                   return var2;
                } else {
                   var2 = buscar_simple(var0.hijoIzquierdo(), var1);
                   return var2;
                }
             }
          } else {
             return false;
          }
       }

       public static <T extends Number> void anchura(ArbolBin<T> var0) {
          if (!var0.esVacio()) {
             Vector var1 = new Vector();
             var1.add(var0);

             while(!var1.isEmpty()) {
                ArbolBin var2 = (ArbolBin)var1.firstElement();
                var1.remove(0);
                System.out.print(String.valueOf(var2.raiz()) + ", ");
                if (!var2.hijoIzquierdo().esVacio()) {
                   var1.add(var2.hijoIzquierdo());
                }

                if (!var2.hijoDerecho().esVacio()) {
                   var1.add(var2.hijoDerecho());
                }
             }
          } else {
             System.out.println("El arbol está vacío");
          }

       }

       public static <T> void eliminar_nodo_hoja(ArbolBin<T> var0) {
          if (!var0.esVacio()) {
             if (var0.hijoDerecho().esVacio() && var0.hijoIzquierdo().esVacio()) {
                var0 = null;
             } else {
                System.out.println(var0.raiz());
                eliminar_nodo_hoja(var0.hijoIzquierdo());
                eliminar_nodo_hoja(var0.hijoDerecho());
             }
          }

       }

       public static <T> void dibujar_arbol(ArbolBin<T> var0, int var1) {
          if (!var0.esVacio()) {
             Vector var2 = new Vector();
             var2.add(var0);

             while(!var2.isEmpty()) {
                for(int var3 = var2.size(); var3 > 0; --var3) {
                   ArbolBin var4 = (ArbolBin)var2.firstElement();
                   var2.remove(0);
                   System.out.print(String.valueOf(var4.raiz()) + ", ");
                   if (!var4.hijoIzquierdo().esVacio()) {
                      var2.add(var4.hijoIzquierdo());
                   }

                   if (!var4.hijoDerecho().esVacio()) {
                      var2.add(var4.hijoDerecho());
                   }
                }

                System.out.println();
             }
          } else {
             System.out.println("El árbol está vacío");
          }

       }

       public static <T> int profundidadN(ArbolBin<T> var0) {
          if (!var0.esVacio()) {
             int var1 = profundidadN(var0.hijoIzquierdo());
             int var2 = profundidadN(var0.hijoDerecho());
             return var1 > var2 ? var1 + 1 : var2 + 1;
          } else {
             return 0;
          }
       }

       public static <T> void Nivel(ArbolBin<T> var0, int var1) {
          if (!var0.esVacio()) {
             if (var1 == 1) {
                System.out.print(String.valueOf(var0.raiz()) + ", ");
             } else if (var1 > 1) {
                Nivel(var0.hijoIzquierdo(), var1 - 1);
                Nivel(var0.hijoDerecho(), var1 - 1);
             }
          }

       }

       public static <T> void anchuraPorNivel(ArbolBin<T> var0) {
          for(int var1 = 1; var1 <= profundidadN(var0); ++var1) {
             Nivel(var0, var1);
             System.out.println();
          }

       }

       public static <T> int num_nodos(ArbolBin<T> var0) {
          if (!var0.esVacio()) {
             int var1 = num_nodos(var0.hijoIzquierdo());
             int var2 = num_nodos(var0.hijoDerecho());
             return var1 + var2 + 1;
          } else {
             return 0;
          }
       }

       public static <T> int profund(ArbolBin<T> var0) {
          if (!var0.esVacio()) {
             int var1 = profund(var0.hijoIzquierdo());
             int var2 = profund(var0.hijoDerecho());
             return var1 > var2 ? var1 + 1 : var2 + 1;
          } else {
             return 0;
          }
       }

       public static int suma_nivel(ArbolBin<Integer> var0, int var1, int var2, int var3) {
          if (!var0.esVacio()) {
             if (var2 == var1) {
                var3 += (Integer)var0.raiz();
                return var3;
             } else {
                int var4 = suma_nivel(var0.hijoIzquierdo(), var1, var2 + 1, var3);
                int var5 = suma_nivel(var0.hijoDerecho(), var1, var2 + 1, var3);
                return var4 + var5;
             }
          } else {
             return 0;
          }
       }

       public static int num_mayorX(ArbolBin<Integer> var0, int var1) {
          if (!var0.esVacio()) {
             if ((Integer)var0.raiz() > var1) {
                int var2 = num_mayorX(var0.hijoIzquierdo(), var1);
                int var3 = num_mayorX(var0.hijoDerecho(), var1);
                return 1 + var2 + var3;
             } else {
                return num_mayorX(var0.hijoDerecho(), var1);
             }
          } else {
             return 0;
          }
       }

       public static boolean esAVL(ArbolBin<Integer> var0) {
          int var1 = profundidad1(var0);
          return var1 != 0;
       }

       public static int profundidad1(ArbolBin<Integer> var0) {
          if (var0.esVacio()) {
             return 0;
          } else {
             int var1 = profundidad1(var0.hijoIzquierdo());
             int var2 = profundidad1(var0.hijoDerecho());
             return Math.abs(var1 - var2) > 1 ? 0 : Math.max(var1, var2) + 1;
          }
       }

       public static void main(String[] var0) {
          /*ArbolBin var1 = ArbolBin.FormarArbol();
          ArbolBin var2 = ArbolBin.FormarArbol1();
          ArbolBin var3 = ArbolBin.FormarArbolBinario();
          eliminar_nodo_hoja(var1);
          System.out.println("---------------------------------------");
          dibujar_arbol(var1, 1);
          System.out.println("---------------------------------------");
          anchuraPorNivel(var1);
          System.out.println("---------------------------------------");
          System.out.println(num_nodos(var1));
          System.out.println("---------------------------------------");
          System.out.println(profund(var1));
          System.out.println("---------------------------------------");
          System.out.println(iguales(var1, var3));
          System.out.println("---------------------------------------");
          System.out.println(iguales(var1, var2));
          System.out.println("---------------------------------------");
          System.out.println(suma_nivel(var1, 3, 1, 0));
          System.out.println("---------------------------------------");
          System.out.println(num_mayorX(var3, 30));
          System.out.println("---------------------------------------");
          System.out.println(esAVL(var3));*/
       }
    }
} // Clase Arbol_N