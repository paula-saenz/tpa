public class buscar {

    public static boolean encontrado (int[][]m1, int n, int iniF, int iniC, int filas, int columnas){
        if(filas<=0 || columnas<=0){
            return true;
        }
        if (filas==1 && columnas==1){
            return m1[iniF][iniC] == n;
        }
        int mitadF= filas/2;
        int mitadC = columnas/2;

        return encontrado(m1, n, iniF, iniC, mitadF, mitadC) ||
        encontrado(m1, n, iniF, mitadC+1, mitadF, columnas-mitadC)||
        encontrado(m1, n, mitadF+1, iniC, filas-mitadF, columnas)||
        encontrado(m1, n, mitadF+1, mitadC+1, filas-mitadF, columnas-mitadC);
   
    }

    public static void main(String[] args) {
        // TO-DO Pruebas_3 de funcionamiento
                int[][] matriz1 = { { 1, 2, 3 }, { 1, 2, 3 } };
                int n=2;
                
                System.out.println("esta el numero? " + encontrado(matriz1, n,0,0,matriz1.length,matriz1[0].length)); 
                System.out.println("\n***** FIN *****");
            }// main


    
}
