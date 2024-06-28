/**
 *
 * @author1 Ramos García, Andrés
 * @expediente1 22039668
 * @author2 Saenz de Santa María Diez, Paula
 * @expediente2 21842142
 * @date 2024-03-15
 *
 */
public class Iguales {
	/**
	 * Función booleana que compara dos matrices de números enteros, aplicando una
	 * estrategía de Divide y Vencerás.
	 *
	 * @param matriz1 Matriz AxB de números enteros
	 * @param m2 Matriz CxD de números enteros
	 * @return true/false en función de si las matrices son iguales
	 */


	private static boolean sonIguales(int[][] m1, int[][] m2, int iniF, int iniC, int filas, int columnas) {


		if (filas <= 0 || columnas <= 0) { 
			return true;
		}
		if (filas == 1 && columnas == 1) {
			
			return m1[iniF][iniC] == m2[iniF][iniC];
		}
		int mitadF = filas / 2;
		int mitadC = columnas / 2;
		
		if(	sonIguales(m1, m2, iniF, iniC, mitadF, mitadC) &&
			sonIguales(m1, m2, iniF, iniC + mitadC, mitadF, columnas - mitadC) &&
			sonIguales(m1, m2, iniF + mitadF, iniC, filas - mitadF, mitadC) &&
			sonIguales(m1, m2, iniF + mitadF, iniC + mitadC, filas - mitadF, columnas - mitadC)) {
			return true;
		}
		return false;
	}// sonIguales
	public static boolean iguales_DV(int[][] matriz1, int[][] matriz2) {
		if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length || !sonIguales(matriz1, matriz2, 0, 0, matriz1.length, matriz1[0].length)) {
			return false;
		}
		return true;
	}// iguales_DV
	public static void main(String[] args) {
// TO-DO Pruebas de funcionamiento
		int[][] matriz1 = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] matriz2 = { { 1, 2, 3 }, { 1, 2, 3 } };
		
		System.out.println("¿Son iguales? " + iguales_DV(matriz1, matriz2));
		System.out.println("\n***** FIN *****");
	}// main
}// class
