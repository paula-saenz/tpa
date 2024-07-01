public class busbin_iterativa {
   public static int pos(int[] a, int ini, int fin, int x) {
      if (a[ini] <= x && a[fin] >= x) {
         if (a[ini] == x) {
            return ini;
         } else if (a[fin] == x) {
            return fin;
         } else {
            int pos = -1;
            boolean encontrado = false;
            while(ini < fin && !encontrado) {
               int mitad = (ini + fin) / 2;
               if (a[mitad] == x) {
                  pos = mitad;
                  encontrado = true;
               }

               if (a[mitad] < x) {
                  ini = mitad;
               } else {
                  fin = mitad - 1;
               }
            }

            return pos;
         }
      } else {
         return -1;
      }
   }

   public static void main(String[] args) {
      int[] a = new int[]{1, 2, 3, 5, 6, 8, 9};
      System.out.println(pos(a, 0, a.length - 1, 8));
      System.out.println(pos(a, 0, a.length - 1, 6));
   }
}
