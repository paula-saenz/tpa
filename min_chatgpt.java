
public class min_chatgpt {
	
	public static int min (int [] a, int ini, int fin) {

	
    if (ini == fin) {
        return a[fin]; // Cuando ini es mayor o igual que fin, solo hay un elemento
    }

    int mitad = (ini + fin) / 2;
    int i = min(a, ini, mitad);
    int d = min(a, mitad + 1, fin);
    if (i<d) {
    	return i;
    }else{
    	return d;
    }
    
	}

	public static void main(String[] args) {

		int[] a = { 7, 3, 4, 1, 5,9,8,0}; 
		
		System.out.println("�Son iguales? " + min(a,0,a.length-1)); 
		System.out.println("\n***** FIN *****"); 
	}
	}


