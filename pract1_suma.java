public class pract1_suma {

        public static int[][] suma(int[][] m1, int[][] m2, int[][] mn, int iniF, int iniC, int filas, int columnas) {

            if (filas <= 0 || columnas <= 0) {
                return mn;
            }
            if (filas == 1 && columnas == 1) {
                mn[iniF][iniC] = m1[iniF][iniC] + m2[iniF][iniC];
                return mn;
            }

            int mitadF = filas / 2;
            int mitadC = columnas / 2;

            mn = suma(m1, m2, mn, iniF, iniC, mitadF, mitadC);
            mn = suma(m1, m2, mn, iniF, iniC + mitadC, mitadF, columnas - mitadC);
            mn = suma(m1, m2, mn, iniF + mitadF, iniC, filas - mitadF, mitadC);
            mn = suma(m1, m2, mn, iniF + mitadF, iniC + mitadC, filas - mitadF, columnas - mitadC);

            return mn;
        }

        public static void main(String[] args) {
            // Pruebas de funcionamiento
            int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
            int[][] matriz2 = { { 7, 8, 9 }, { 1, 2, 3 } };

            if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
                int[][] matrizResultado = new int[matriz1.length][matriz1[0].length];
                matrizResultado = suma(matriz1, matriz2, matrizResultado, 0, 0, matriz1.length, matriz1[0].length);

                System.out.println("Matriz resultante de la suma:");
                for (int i = 0; i < matrizResultado.length; i++) {
                    for (int j = 0; j < matrizResultado[i].length; j++) {
                        System.out.print(matrizResultado[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Las matrices deben tener las mismas dimensiones.");
            }

            System.out.println("\n***** FIN *****");
        }
    }


