public class moneditas {


        public static double[] devolverCambio(double[] monedas, double cantidad) {
            double[] sol = new double[monedas.length];
            double acumulado = 0;
            int i = 0;
    
            while (acumulado < cantidad && i < monedas.length) {
                if(acumulado + monedas[i] <= cantidad){
                    double resultado = (cantidad - acumulado) / monedas[i];
                    acumulado += monedas[i]* resultado;
                    sol[i]++;
                }
                
                i++;
            }
            
    
            if (acumulado != cantidad) {
                return null; // No se puede devolver el cambio exacto
            } else {
                return sol;
            }
        }
    
        public static void main(String[] args) {
            double[] monedasDisponibles = {5, 2, 1, 0.5, 0.2, 0.1, 0.05};
            double[] resultado = devolverCambio(monedasDisponibles, 5.30);
    
            if (resultado != null) {
                System.out.println("Cambio devuelto:");
                for (int i = 0; i < resultado.length; i++) {
                    if (resultado[i] > 0) {
                        System.out.print(monedasDisponibles[i] + " x " +(int) resultado[i]+", ");
                    }
                }
            } else {
                System.out.println("No se puede devolver el cambio exacto.");
            }
        }
    }
    
    

