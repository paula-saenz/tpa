public class Mergesort {
   private static void mergesort(int[] l) {
      if (l.length != 1) {
         int mitad = l.length / 2;
         int[] Lizq = new int[mitad];
         int[] Lder = new int[l.length - mitad];

         int i;
         for(i = 0; i < mitad; ++i) {
            Lizq[i] = l[i];
         }

         for(i = mitad; i < l.length; ++i) {
            Lder[i - mitad] = l[i];
         }

         mergesort(Lizq);
         mergesort(Lder);
         merge(Lizq, Lder, l);
      }

   }

   private static void merge(int[] li, int[] ld, int[] l) {
      int i = 0;
      int d = 0;
      int cont = 0;

      while(i < li.length && d < ld.length) {
         if (li[i] < ld[d]) {
            l[cont] = li[i];
            ++i;
            ++cont;
         } else {
            l[cont] = ld[d];
            ++d;
            ++cont;
         }
      }

      while(i < li.length) {
         l[cont] = li[i];
         ++i;
         ++cont;
      }

      while(d < ld.length) {
         l[cont] = ld[d];
         ++d;
         ++cont;
      }

   }

   private static void imprimir(int[] l) {
      for(int i = 0; i <= l.length - 1; ++i) {
         System.out.print(l[i] + " ");
      }

      System.out.println();
   }

   public static void main(String[] args) {
      int[] L = new int[]{98, 2, 5, 9, 1, 6};
      mergesort(L);
      imprimir(L);
   }
}
