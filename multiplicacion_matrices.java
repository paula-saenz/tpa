public class multiplicacion_matrices {


    public static int[][] multiplicacion(int[][] A, int[][] B) {
        // columnas de la matriz A
        int n = A[0].length;
        // filas de la matriz A
        int m = A.length;
        // filas de la matriz B
        int n2 = B.length;
        // columnas de la matriz B
        int o = B[0].length;
        // nueva matriz
        int[][] C = new int[m][o];

        // se comprueba si las matrices se pueden multiplicar
        if (n == n2) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < o; j++) {
                    for (int k = 0; k < n; k++) {
                        // aquí se multiplica la matriz
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }

        // si no se cumple la condición se retorna una matriz vacía
        return C;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] B = {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
        };

        int[][] C = multiplicacion(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
