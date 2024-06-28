public class suma {

        public static int[][] sumando (int[][] m1, int[][] m2, int[][] mn, int iniF, int iniC, int filas, int columnas){

            if(filas<=0 || columnas<=0){
                return mn;
            }
            if(filas==1 && columnas==1){
                mn[iniF][iniC]= m1[iniF][iniC] + m2[iniF][iniC];
                return mn;
            }
            int mitadF = filas / 2;
		    int mitadC = columnas / 2;
            mn = sumando(m1, m2,mn, iniF, iniC, mitadF, mitadC);
			mn = sumando(m1, m2,mn, iniF, iniC + mitadC, mitadF, columnas - mitadC);
			mn = sumando(m1, m2,mn, iniF + mitadF, iniC, filas - mitadF, mitadC);
			mn = sumando(m1, m2,mn, iniF + mitadF, iniC + mitadC, filas - mitadF, columnas - mitadC);
			

            return mn;
        }

    public static void main(String[] args) {
        // TO-DO Pruebas de funcionamiento
                int[][] matriz1 = { { 1, 2, 3 }, { 1, 2, 3 } };
                int[][] matriz2 = { { 1, 2, 3 }, { 1, 2, 3 } };
                int[][] matriz3 =  new int[matriz1.length][matriz1[0].length];
                
                if (matriz1.length == matriz2.length || matriz1[0].length == matriz2[0].length) {
                    System.out.println("¿suma? " + sumando(matriz1, matriz2,matriz3,0,0,matriz1.length,matriz1[0].length)); 
                    
                    System.out.println("Matriz resultante de la suma:");
                    for (int i = 0; i < matriz3.length; i++) {
                        for (int j = 0; j < matriz3[i].length; j++) {
                            System.out.print(matriz3[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else{
                    System.out.println("matriz no tiene las dimensiones correctas");
                }
            
               
           
                System.out.println("\n***** FIN *****");
            }// main
    
}
