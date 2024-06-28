public class esPrimo {
   public static boolean esPrimo(int n) {
      boolean primo = true;

      for(int i = 2; i <= n / 2; ++i) {
         if (n % i == 0) {
            primo = false;
         }
      }

      return primo;
   }

   public static void main(String[] args) {
      int n = 90;
      System.out.print(esPrimo(n));
   }
}
