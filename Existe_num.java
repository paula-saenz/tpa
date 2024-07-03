
public class Existe_num {
	
	/*
	 * en una lista ordenada de manera ascendente, buscar si un numero esta
	 * y si no esta, devolver la posicion 0 y si que esta, devolver la 
	 * posicion correcta
	 */
	
	public static int pos (int [] lista, int ini, int fin, int x) {
		if (ini>fin) {
			return 0-1;
		}else {
			int mitad = (ini+fin)/2;
			if(x==lista[mitad]) {
				return mitad;
			} else {
				if (x<lista[mitad]) {
					return pos(lista,ini,mitad-1,x);
				}else {
					return pos(lista,mitad+1, fin,x);
				}
			}
			
		}
		
	}
	
	public static int BusBin (int [] lista, int x) {
		if(lista.length-1 == 0 || x<lista[0] || x>lista[lista.length-1]) {
			return 0;
		}else {
			//el +1 es para que salga la posicion real
			return pos(lista,0,lista.length-1,x)+1;
		}
	}

	public static void main(String[] args) {

		int [] lista = {1,3,4,6,6,8,13,19,34,56};
		int ini = lista[0];
		int fin = lista.length-1;
		int x=12;
		
		System.out.println(BusBin(lista,x));
	}
	
	

}
