public class ArbolBin<T> {
   private ArbolBin<T>.NodoBin raiz;

   public ArbolBin() {
      this.raiz = null;
   }

   public ArbolBin(ArbolBin<T> var1, T var2, ArbolBin<T> var3) {
      ArbolBin.NodoBin var4 = var1 == null ? null : var1.raiz;
      ArbolBin.NodoBin var5 = var3 == null ? null : var3.raiz;
      this.raiz = new ArbolBin.NodoBin(this, var4, var2, var5);
   }

   public boolean esVacio() {
      return this.raiz == null;
   }

   public T raiz() {
      return this.raiz.info;
   }

   public ArbolBin<T> hijoIzquierdo() {
      ArbolBin var1 = new ArbolBin();
      var1.raiz = this.raiz.hijoIzq;
      return var1;
   }

   public ArbolBin<T> hijoDerecho() {
      ArbolBin var1 = new ArbolBin();
      var1.raiz = this.raiz.hijoDcho;
      return var1;
   }

   public void dibujar(int var1) {
      if (!this.esVacio()) {
         for(int var2 = 1; var2 <= var1; ++var2) {
            System.out.print("  ");
         }

         System.out.println(this.raiz());
         this.hijoIzquierdo().dibujar(var1 + 1);
         this.hijoDerecho().dibujar(var1 + 1);
      }

   }

   public static ArbolBin<Integer> FormarArbol() {
      ArbolBin var0 = new ArbolBin(new ArbolBin(), 7, new ArbolBin());
      ArbolBin var1 = new ArbolBin(new ArbolBin(), 6, new ArbolBin());
      ArbolBin var2 = new ArbolBin(var1, 5, var0);
      ArbolBin var3 = new ArbolBin(new ArbolBin(), 4, new ArbolBin());
      ArbolBin var4 = new ArbolBin(new ArbolBin(), 3, new ArbolBin());
      ArbolBin var5 = new ArbolBin(var4, 2, var3);
      return new ArbolBin(var5, 1, var2);
   }

   public static ArbolBin<Integer> FormarArbol1() {
      ArbolBin var0 = new ArbolBin(new ArbolBin(), 7, new ArbolBin());
      ArbolBin var1 = new ArbolBin(new ArbolBin(), 6, new ArbolBin());
      ArbolBin var2 = new ArbolBin(var1, 5, var0);
      ArbolBin var3 = new ArbolBin(new ArbolBin(), 4, new ArbolBin());
      ArbolBin var4 = new ArbolBin(new ArbolBin(), 3, new ArbolBin());
      ArbolBin var5 = new ArbolBin(var4, 2, var3);
      return new ArbolBin(var5, 1, var2);
   }

   public static ArbolBin<Integer> FormarArbolBinario() {
      ArbolBin var0 = new ArbolBin(new ArbolBin(), 15, new ArbolBin());
      ArbolBin var1 = new ArbolBin(new ArbolBin(), 5, new ArbolBin());
      ArbolBin var2 = new ArbolBin(var1, 10, var0);
      return new ArbolBin(var2, 20, new ArbolBin());
   }
}
