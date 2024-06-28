public class mergesort_javi {
   public static void mergesort(int[] var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = (var1 + var2) / 2;
         int[] var4 = new int[var0.length + 1];
         int[] var5 = new int[var0.length + 1];

         int var6;
         for(var6 = var1; var6 <= var3; ++var6) {
            var4[var6] = var0[var6];
         }

         for(var6 = var3 + 1; var6 <= var2; ++var6) {
            var5[var6] = var0[var6];
         }

         mergesort(var4, var1, var3);
         mergesort(var5, var3 + 1, var2);
         merge(var4, var5, var0, var1, var2, var3);
      }

   }

   public static void merge(int[] var0, int[] var1, int[] var2, int var3, int var4, int var5) {
      var0[var5 + 1] = Integer.MAX_VALUE;
      var1[var4 + 1] = Integer.MAX_VALUE;
      int var6 = var3;
      int var7 = var5 + 1;

      for(int var8 = var3; var8 <= var4; ++var8) {
         if (var0[var6] < var1[var7]) {
            var2[var8] = var0[var6];
            ++var6;
         } else {
            var2[var8] = var1[var7];
            ++var7;
         }
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 3, 45, 2, 4, 5, 78, 4};
      byte var2 = 0;
      int var3 = var1.length - 1;
      mergesort(var1, var2, var3);

      for(int var4 = 0; var4 < var1.length; ++var4) {
         System.out.print(var1[var4] + " ");
      }

   }
}
