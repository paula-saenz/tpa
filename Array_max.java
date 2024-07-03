public class Array_max {
	
	public static int max (int [] num) {
		if (num.length == 1) {
			return num[0];
		}else {
			int max_izq =0;
			int max_der =0;
			
			int [] l_izq = new int [num.length/2];
			//si hacemos la misma operacion para l_der entomces no tiene en cuenta el ultimo numero si es impar, por lo que para
			// que salga bien, hacemos una primera division y luego se lo restamos a lo restante 
			int [] l_der = new int [num.length - l_izq.length];
			
			for (int i=0;i<l_izq.length;i++) {
				l_izq[i] = num[i];
			}
			for (int i=0;i<l_der.length;i++) {
				 l_der[i]= num[i+l_izq.length];
			}
			max_izq = max(l_izq);
			max_der = max(l_der);
			
			int solucion= Math.max(max_izq, max_der);
			return solucion;
			
	} 
	}

	public static void main(String[] args) {

		int [] num = {1,2,4,67,6,8,9,12,63,90,122,67,1045};
		System.out.println(max(num));
		

}
}
