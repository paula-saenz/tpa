
public class Posicion_distintos {
	
	
	public static int pos (int []a, int []b, int ini, int fin, int pos) {
		if (ini==fin) {
			if(a[ini]!=b[ini]) {
				return pos;
			} else {
				pos= pos +1;
				return pos;
			}
		}
		int mitad = (ini+fin)/2;
		
		int i = pos(a,b,ini,mitad,pos);
		if(i==ini) {
		int d = pos(a,b,mitad+1,fin,pos);
		return d;
		}
		return i;
		
		
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4 }; 
		int[] b =  { 1, 2, 3 }; 
		
		if (a.length != b.length )  { 
			System.out.println("Las matrices no son iguales, ya que tienen dimensiones diferentes"); // orden 2 + orden n
			System.out.println("\n***** FIN *****");  
		} else {
			System.out.println("�Son iguales? " + pos(a, b,0,a.length-1,0)); 
			System.out.println("\n***** FIN *****"); 
		}
		

	}

}
