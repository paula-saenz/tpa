public class pract1_haynum {

        public static boolean encontrado(int[][] m1, int n, int iniF, int iniC, int filas, int columnas) {
            if (filas <= 0 || columnas <= 0) {
                return false;
            }
            if (filas == 1 && columnas == 1) {
                return m1[iniF][iniC] == n;
            }

            int mitadF = filas / 2;
            int mitadC = columnas / 2;

            return encontrado(m1, n, iniF, iniC, mitadF, mitadC) ||
                    encontrado(m1, n, iniF, iniC + mitadC, mitadF, columnas - mitadC) ||
                    encontrado(m1, n, iniF + mitadF, iniC, filas - mitadF, mitadC) ||
                    encontrado(m1, n, iniF + mitadF, iniC + mitadC, filas - mitadF, columnas - mitadC);
        }

        public static void main(String[] args) {
            // Pruebas de funcionamiento
            int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
            int n = 2;

            System.out.println("¿Está el número? " + encontrado(matriz1, n, 0, 0, matriz1.length, matriz1[0].length));
            System.out.println("\n***** FIN *****");
        }
    }



