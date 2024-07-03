public class monedas {

    public static int[] devolverCambio(double[] monedas, double cantidad) {
        int[] sol = new int[monedas.length];
        int acumulado = 0;
        int cantidadCentavos = (int) (cantidad * 100); // Convertir a centavos para trabajar con enteros

        for (int i = 0; i < monedas.length; i++) {
            while (acumulado + Math.round(monedaACentavos(monedas[i])) <= cantidadCentavos && i < monedas.length) {
                sol[i]++;
                acumulado += Math.round(monedaACentavos(monedas[i]));
            }
        }

        if (acumulado != cantidadCentavos) {
            return null; // No se puede devolver el cambio exacto
        } else {
            return sol;
        }
    }

    // Función para convertir monedas a centavos
    private static int monedaACentavos(double moneda) {
        return (int) (moneda * 100);
    }

    public static void main(String[] args) {
        double[] monedasDisponibles = {5, 2, 1, 0.5, 0.2, 0.1, 0.05};
        int[] resultado = devolverCambio(monedasDisponibles, 15.30);

        if (resultado != null) {
            System.out.println("Cambio devuelto:");
            for (int i = 0; i < resultado.length; i++) {
                if (resultado[i] > 0) {
                    System.out.println(monedasDisponibles[i] + " x " + resultado[i]);
                }
            }
        } else {
            System.out.println("No se puede devolver el cambio exacto.");
        }
    }
}
