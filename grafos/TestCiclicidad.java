
/**
 * @author1 Ramos García, Andrés
 * @expediente1 22039668
 * @author2 Sáenz de Santa María Diez, Paula
 * @expediente2 21842142
 * @date 28/05/2024
 * @version 1.2
 */

public class TestCiclicidad {

 

     /**
     * Función principal que recorre todos los vertices del grafo
     * @param <Clave> Identificador del vértice
     * @param <InfoVertice> Información asociada al vértice
     * @param <Coste> Peso de la arista
     * @param grafo el grafo en el que se quieren buscar los ciclos
     * @return true si se encuentra un ciclo en el grafo, sino retorna false
     */
    public static  <Clave, InfoVertice, Coste> boolean testCiclos (Grafo<Clave, InfoVertice, Coste> grafo){
        int i =1;
        boolean encontrado = false;
        Lista<Clave> visitados = new Lista<>();

        //pasamos por todos los vertices del grafo hasta que encuentre un ciclo
        while (i<=grafo.listaVertices().longitud() && encontrado == false){
            Clave v = grafo.listaVertices().consultar(i);
            visitados.insertar(visitados.longitud()+1, v);
            encontrado = testCiclos_aux(grafo, v, new Lista<>());
            i++;
        }
        return encontrado;
    }

    /**
     * Función auxiliar que recorre todos los caminos posibles desde un vertice de inicio
     * @param <Clave> Identificador del vértice
     * @param <InfoVertice> Información asociada al vértice
     * @param <Coste> Peso de la arista
     * @param gr el grafo en el que se buscan los ciclos (se recorren los caminos)
     * @param inicio el vértice desde el cual comienzan todos los caminos
     * @param camino lista de vértices que se van añadiendo segun se visitan 
     * @return true si se encuentra un ciclo en el camino actual y false en caso de que no
     */
      private static <Clave, InfoVertice, Coste> boolean testCiclos_aux(Grafo<Clave, InfoVertice, Coste> gr, 
			Clave inicio,Lista<Clave> camino){
                boolean encuentra = false;
                //encuentra ciclo en el camino actual 
                if(camino.buscar(inicio)!=0){ 
                    return true;
                } else{
                    camino.insertar(camino.longitud()+1, inicio);
                    int i = 1;
                    Lista<Clave> sucesores = gr.listaSucesores(inicio); 
                    //pasa por todos los sucesores 
                    while (i <= sucesores.longitud() && !encuentra ){
                        Clave v = sucesores.consultar(i);
                        encuentra = testCiclos_aux(gr, v, camino);
                        i++;    	
                    }
                    camino.borrar(camino.longitud());
                    return encuentra;
                }  
            }         
    

    public static void main (String[]args){

        Grafo<String, String, Integer> gPrueba = new Grafo<String, String, Integer>();
        Grafo<String, String, Integer> gPrueba1 = new Grafo<String, String, Integer>();
        Grafo<String, String, Integer> gPrueba2 = new Grafo<String, String, Integer>();


        //------------------------------ gPrueba --------------------------------------------
        // grafo en el que todo sale de b y el vertice f no es conexo
        gPrueba.insertarVertice("A", "A");
        gPrueba.insertarVertice("B", "B");
        gPrueba.insertarVertice("C", "C");
        gPrueba.insertarVertice("D", "D");
        gPrueba.insertarVertice("E", "E");
        gPrueba.insertarVertice("F", "F");


        gPrueba.insertarArista("B", "A", 1);
        gPrueba.insertarArista("B", "C", 1);
        gPrueba.insertarArista("B", "D", 1);
        gPrueba.insertarArista("B", "E", 1);

        //------------------------------ gPrueba1 --------------------------------------------
        //grafo ciclico

        gPrueba1.insertarVertice("A", "A");
        gPrueba1.insertarVertice("B", "B");
        gPrueba1.insertarVertice("C", "C");
        gPrueba1.insertarVertice("D", "D");
        gPrueba1.insertarVertice("E", "E");
        gPrueba1.insertarVertice("F", "F");


        gPrueba1.insertarArista("A", "B", 1);
        gPrueba1.insertarArista("B", "C", 1);
        gPrueba1.insertarArista("C", "D", 1);
        gPrueba1.insertarArista("D", "E", 1);
        gPrueba1.insertarArista("E", "F", 1);
        gPrueba1.insertarArista("F", "A", 1);

        //------------------------------ gPrueba2 --------------------------------------------
        //grafo sin aristas

        gPrueba1.insertarVertice("A", "A");
        gPrueba1.insertarVertice("B", "B");
        gPrueba1.insertarVertice("C", "C");
        gPrueba1.insertarVertice("D", "D");
        gPrueba1.insertarVertice("E", "E");
        gPrueba1.insertarVertice("F", "F");




       
        System.out.println("--------¿Tiene un ciclo gPrueba?--------");
        System.out.println(testCiclos(gPrueba));
        System.out.println("--------¿Tiene un ciclo gPrueba1?--------");
        System.out.println(testCiclos(gPrueba1));
        System.out.println("--------¿Tiene un ciclo gPrueba2?--------");
        System.out.println(testCiclos(gPrueba2));
    }
}