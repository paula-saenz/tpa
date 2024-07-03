public class ej3_dv {

    public static void pivotebis(int[] T, int i, int j, int[] kl) {
        int pivot = T[i];
        int ini = i;
        int fin = j;

        int l = i;

        while (l <= fin) {
            if (T[l] < pivot) {
                swap(T, ini, l);
                ini++;
                l++;
            } else if (T[l] > pivot) {
                swap(T, l, fin);
                fin--;
            } else {
                l++;
            }
        }

        // Devolver las posiciones k y l en el array de resultados
        kl[0] = ini+1; //para que sea el valor empezando desde 1
        kl[1] = l; // en vez de restarle 1, lo dejamos como es para simule el array empezando desde 1
    }

    private static void swap(int[] T, int a, int b) {
        int temp = T[a];
        T[a] = T[b];
        T[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 3, 4, 8, 5, 4, 8, 3, 2};
        int[] kl = new int[2]; // Array para almacenar los valores de k y l

        pivotebis(array, 0, array.length - 1, kl);

        System.out.println("Array después de pivotebis: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nValor de k: " + kl[0]);
        System.out.println("Valor de l: " + kl[1]);
    }




        }



