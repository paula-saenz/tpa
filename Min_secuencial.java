
public class Min_secuencial {

	public static int min (int [] a) {

		int aux = a[0];
		for (int i=0;i<a.length-1;i++) {
			if(aux>a [i+1]) {
				aux = a[i+1];
			}
		}
		return aux;
		
	}
		public static void main(String[] args) {

			int[] a = { 7, 3, 4, 1, 5,9,8,0}; 
			
			System.out.println("El valor mas pequennio es: " + min(a)); 
			System.out.println("\n***** FIN *****"); 
		}
		}


