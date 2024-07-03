
public class min {

	public static int min (int [] a, int ini, int fin) {
		if (ini==fin) {
			if(a[ini]<=a[fin]) {
				return a[ini];
			}else {
				return a[fin];
			}
		}
		
		int mitad = (ini+fin)/2;
		int i = min(a,ini,mitad);
		int d= min (a,mitad+1,fin);
		return Math.min(i, d);
		
		
	}
		
	public static void main(String[] args) {
		int[] a = { 7, 3, 4,6, 1, 5};
		System.out.println(a.length);
		System.out.println(a.length-1);


		System.out.println("el numero mas pequeño es " + min(a,0,a.length-1));
		System.out.println("\n***** FIN *****");
		}

	}


