import javax.swing.text.html.parser.Parser;

public class Ejercicios {

    /*FUNCION 1:
    le pasasmos un grafo generico y tiene que pasar por pantalla el grado de cada vertice
     */

    public static void grado_vertice(Grafo<String, String, Integer> garfo) {
        if (!garfo.esVacio()) {
            System.out.println("A tiene un grado de: " + (garfo.gradoEntrada("A") + garfo.gradoSalida("A")));
            System.out.println("B tiene un grado de: " + (garfo.gradoEntrada("B") + garfo.gradoSalida("B")));
            System.out.println("C tiene un grado de: " + (garfo.gradoEntrada("C") + garfo.gradoSalida("C")));

        }
    }

    public static <Clave, InfoVertice, Coste> void grado_vertice_g (Grafo<Clave, InfoVertice, Coste> grafoo) {
        if (!grafoo.esVacio()) {
                for (int i=1; i<=grafoo.listaVertices().longitud(); i++){
                    //imprimir clave y sus grados
                    System.out.println(grafoo.listaVertices().consultar(i)+" tiene un grado de: " +
                            (grafoo.gradoEntrada(grafoo.listaVertices().consultar(i))+
                                    grafoo.gradoSalida(grafoo.listaVertices().consultar(i))));
                }
        }
    }
    /* FUNCION 2:
    le pasamos el grafo y nos tiene que devolver como resultado (int) cual es el grado del grafo
     */

    public static int grado_grafo (Grafo<String, String, Integer> grafo){
        if (!grafo.esVacio()) {
            int grado_vertice_primero = grafo.gradoEntrada(grafo.listaVertices().consultar(1))+
                    grafo.gradoSalida(grafo.listaVertices().consultar(1));
            int aux = 0;
            for(int i=1; i<=grafo.listaVertices().longitud(); i++){
                //quiero comparar ahora el grado de cada uno y guardar el mayor
                int grado_vertice_actual = grafo.gradoEntrada(grafo.listaVertices().consultar(i))+
                        grafo.gradoSalida(grafo.listaVertices().consultar(i));
                if (grado_vertice_actual >= grado_vertice_primero){
                    aux= grado_vertice_actual;
                } else{
                    aux = grado_vertice_primero;
                }
            }
            return aux;
        }
        return 0;
    }

    /*
    cuente cuantos bucles hay en el grafo (va de a->a) para cada vertice?
    se me ocurre, si estamos en el vertice a, comprobar si uno de sus sucesores es el mismo vertice
     */
    public static <Clave, InfoVertice, Coste> int bucle_grafo (Grafo<Clave, InfoVertice, Coste> grafo){
        if (!grafo.esVacio()) {
            int aux = 0;
            //pasamos por todos los vertices
            for(int i=1; i<=grafo.listaVertices().longitud(); i++){
                // cogemos el dato en string del vertice actual
                Clave vertice = grafo.listaVertices().consultar(i);
                //nos pasamos por cada lista de sucesores de cada vertice
                for (int j=1; j<= grafo.listaSucesores(vertice).longitud();j++){
                    //comparar nuestro vertice actual y si algun sucesor coincide
                    // "A" == "B"
                    if(vertice==grafo.listaSucesores(vertice).consultar(j)){
                        aux++;
                    }
                }

            }
            return aux;
        }
        return 0;
    }


    /*
     * ejercicio: Escribir una función que reciba como entrada un grafo dirigido, y devuelva como
        resultado cuántos vértices aislados tiene dicho grafo. Utilizar para ello las operaciones
        del TAD Grado_Dirigido estudiado en clase. Calcular su complejidad de manera
        razonada.
     */

     public static <Clave, InfoVertice, Valor> int vertices_aislados (Grafo<Clave, InfoVertice, Valor> g){
        if (g.esVacio()){ //o(1)
            return 0; //o(1)
        } else {
            int num=0; //o(1)
            int longi = g.listaVertices().longitud(); // o(n)
            for (int i=1; i<=longi ;i++){ 
                Clave v = g.listaVertices().consultar(i);
                int grado_vertice = g.gradoEntrada(v) +
                 g.gradoSalida(v);
                if(grado_vertice == 0){ // o(1)
                    num++; // o(1)
                }
            }
            return num;
        }
     }
     

        public static void main (String[]args){

            Grafo<String, String, Integer> gPrueba = new Grafo<String, String, Integer>();

            gPrueba.insertarVertice("A", "A");
            gPrueba.insertarVertice("B", "B");
            gPrueba.insertarVertice("C", "C");
            gPrueba.insertarVertice("D", "D");
            gPrueba.insertarVertice("E", "E");



            gPrueba.insertarArista("A", "A", 1);
            gPrueba.insertarArista("A", "B", 1);
            gPrueba.insertarArista("A", "C", 1);
            gPrueba.insertarArista("B", "A", 1);
            gPrueba.insertarArista("B", "B", 1);
            gPrueba.insertarArista("C", "C", 1);
            gPrueba.insertarArista("C", "B", 1);

            System.out.println("--------------------------grado vertices Especifico--------------------------------");
            grado_vertice(gPrueba);
            System.out.println();
            System.out.println("--------------------------grado vertices General --------------------------------");
            grado_vertice_g(gPrueba);
            System.out.println();
            System.out.println("--------------------------grado vertices General --------------------------------");
            System.out.println("El grado del Grafo es: " + grado_grafo(gPrueba));

            System.out.println("--------------------------cuantos bucles tiene el grafo --------------------------------");
            System.out.println("El grafo tiene " + bucle_grafo(gPrueba) + " bucles.");

            System.out.println("--------------------------listaAristas --------------------------------");
            System.out.println(" " + gPrueba.listaAristas()+ " aristas.");

            System.out.println("--------------------------grafos aislados --------------------------------");

            System.out.println(vertices_aislados(gPrueba));

        }
    }

