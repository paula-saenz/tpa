public class matriz_traspuesta {

    public static void traspuesta (int[][]m1,int[][]m2,int iif, int ic, int f, int c) {
       if(f<=0 || c<=0){
           m2[iif][ic]=0;
       }
        if (f == 1 && c == 1) {
            if (iif == ic) {
                m2[iif][ic] = m1[iif][ic];
            } else {
                m2[iif][ic] = m1[ic][iif];
            }
        } else {
            int mf = f / 2;
            int mc = c / 2;

            traspuesta(m1, m2, iif, ic, mf, mc);
            traspuesta(m1, m2, iif + mf, ic, f - mf, mc);
            traspuesta(m1, m2, iif, ic + mc, mf, c - mc);
            traspuesta(m1, m2, iif + mf, ic + mc, f - mf, c - mc);
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {0,9,8,7},
                {1,3,4,5},
                {5,4,3,2},
        };

        int[][] b = new int[a.length][a[0].length];


        traspuesta(a, b, 0, 0, a.length, a[0].length);
        imprimirMatriz(b);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
