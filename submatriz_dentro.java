public class submatriz_dentro {

    public static boolean m_id(int[][] A, int[][] B, int iif, int ic, int f, int c, int bf, int bc) {
        // Caso base: Si el tamaño de la submatriz A es menor que B, B no puede estar contenida
        if (f - iif < bf || c - ic < bc) {
            return false;
        }

        // Verificar si B está contenida en la submatriz actual de A
        for (int i = iif; i <= f - bf; i++) {
            for (int j = ic; j <= c - bc; j++) {
                if (isSubmatrix(A, B, i, j, bf, bc)) {
                    return true;
                }
            }
        }

        // Dividir la matriz A en cuatro submatrices y verificar cada una
        int midF = iif + (f - iif) / 2;
        int midC = ic + (c - ic) / 2;

        return m_id(A, B, iif, ic, midF, midC, bf, bc) ||  // Cuadrante superior izquierdo
                m_id(A, B, iif, midC, midF, c, bf, bc) ||  // Cuadrante superior derecho
                m_id(A, B, midF, ic, f, midC, bf, bc) ||   // Cuadrante inferior izquierdo
                m_id(A, B, midF, midC, f, c, bf, bc);      // Cuadrante inferior derecho
    }

    // Función para verificar si B está contenida en A en la posición (iif, ic)
    private static boolean isSubmatrix(int[][] A, int[][] B, int iif, int ic, int bf, int bc) {
        for (int i = 0; i < bf; i++) {
            for (int j = 0; j < bc; j++) {
                if (A[iif + i][ic + j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] B = {
                {8, 9},
                {13, 14}
        };

        boolean resultado = m_id(A, B, 0, 0, A.length, A[0].length, B.length, B[0].length);
        System.out.println("¿Está la matriz B dentro de la matriz A? " + resultado);
    }


}

