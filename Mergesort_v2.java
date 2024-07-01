
public class Mergesort_v2 {
	 public static void mergesort(int[] lista, int inicio, int fin){
	        if(inicio < fin){
	            int mitad = (inicio + fin) / 2;
	            int[] listaIzq = new int[lista.length + 1]; 
	            int[] listaDer = new int[lista.length + 1];
	            for(int i = inicio; i <= mitad; i++){
	                listaIzq[i] = lista[i];
	            }
	            for(int i = mitad+1; i <= fin; i++){
	                listaDer[i] = lista[i];
	            }
	            mergesort(listaIzq, inicio, mitad);
	            mergesort(listaDer, mitad + 1, fin);
	            merge(listaIzq, listaDer, lista, inicio, fin, mitad);
	        }
	    }

	    public static void merge (int[] listaIzq, int[] listaDer, int[] lista, int inicio, int fin, int mitad){
	        listaIzq[mitad+1] = Integer.MAX_VALUE;
	        listaDer[fin+1] = Integer.MAX_VALUE;
	        int i = inicio;
	        int d = mitad + 1;
	        for(int cont = inicio; cont <= fin; cont++){
	            if(listaIzq[i] < listaDer[d]){
	                lista[cont] = listaIzq[i];
	                i++;
	            } else {
	                lista[cont] = listaDer[d];
	                d++;
	                }
	            }
	        }
	    
	    public static void main(String[] args) {
			int [] lista = {1,3,45,2,4,5,78,4};
			int inicio=0;
			int fin = lista.length;
			
			mergesort(lista,inicio,fin);
			
			for (int i=0;i<lista.length-1;i++) {
				System.out.print(lista[i] + " ");
			}
		}
}
