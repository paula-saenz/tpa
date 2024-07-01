public class pract1_iguales {

        public static boolean iguales (int[][] m1, int[][] m2, int iniF, int iniC, int filas, int columnas) {

            if (filas <= 0 || columnas <= 0) {
                return true;
            }
            if (filas == 1 && columnas == 1) {
                return  m1[iniF][iniC] == m2[iniF][iniC];
            }

            int mitadF = filas / 2;
            int mitadC = columnas / 2;

            if(! iguales(m1, m2, iniF, iniC, mitadF, mitadC)
            || !iguales(m1, m2, iniF, iniC + mitadC, mitadF, columnas - mitadC)
            || !iguales(m1, m2, iniF + mitadF, iniC, filas - mitadF, mitadC)
            || !iguales(m1, m2, iniF + mitadF, iniC + mitadC, filas - mitadF, columnas - mitadC)){
                return false;
            }
            return true;
        }

        public static void main(String[] args) {
            // Pruebas de funcionamiento
            int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
            int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 } };

            System.out.println("¿Son iguales? " + iguales(matriz1, matriz2, 0, 0, matriz1.length, matriz1[0].length));
            System.out.println("\n***** FIN *****");

        }
    }




