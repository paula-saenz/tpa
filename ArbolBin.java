import Ejemplos.num_node;

public class ArbolBin <T> {

    class NodoBin {
        T info;
        NodoBin hijoIzq;
        NodoBin hijoDcho;

        NodoBin(NodoBin hIzq, T info, NodoBin hDcho) {
            this.hijoIzq = hIzq;
            this.hijoDcho = hDcho;
            this.info = info;
        }
    }

    private NodoBin raiz;

    public ArbolBin() {
        raiz = null;
    }

    public ArbolBin(ArbolBin<T> subIzq, T infoRaiz, ArbolBin<T> subDcho) {
        NodoBin izq = subIzq == null? null : subIzq.raiz;
        NodoBin dcho = subDcho == null? null : subDcho.raiz;
        this.raiz = new NodoBin(izq, infoRaiz, dcho);
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public T raiz() { //get
        return this.raiz.info;
    }

    public ArbolBin<T> hijoIzquierdo() {
        ArbolBin<T> subIzq = new ArbolBin<T>();
        subIzq.raiz = this.raiz.hijoIzq;

        return subIzq;
    }

    public ArbolBin<T> hijoDerecho() {
        ArbolBin<T> subDcho = new ArbolBin<T>();
        subDcho.raiz = this.raiz.hijoDcho;

        return subDcho;
    }

    public void dibujar(int nivel){

        if ( !this.esVacio() ){
            for (int i = 1; i<= nivel; i++) {
                System.out.print("  ");
            }
            System.out.println(this.raiz());
            this.hijoIzquierdo().dibujar(nivel+1);
            this.hijoDerecho().dibujar(nivel+1);
        }
    }//dibujar


    public static ArbolBin<Integer> FormarArbol() {
        ArbolBin<Integer> a7 = new ArbolBin<>(new ArbolBin<>(),7,new ArbolBin<>());
        ArbolBin<Integer> a6 = new ArbolBin<>(new ArbolBin<>(),6,new ArbolBin<>());
        ArbolBin<Integer> a5 = new ArbolBin<>(a6,5, a7);
        ArbolBin<Integer> a4 = new ArbolBin<>(new ArbolBin<>(),4,new ArbolBin<>());
        ArbolBin<Integer> a3 = new ArbolBin<>(new ArbolBin<>(),3,new ArbolBin<>());
        ArbolBin<Integer> a2 = new ArbolBin<>(a3,2,a4);
        return new ArbolBin<>(a2,1,a5);

    }

    public static ArbolBin<Integer> FormarArbol1() {
        ArbolBin<Integer> a7 = new ArbolBin<>(new ArbolBin<>(),7,new ArbolBin<>());
        ArbolBin<Integer> a6 = new ArbolBin<>(new ArbolBin<>(),6,new ArbolBin<>());
        ArbolBin<Integer> a5 = new ArbolBin<>(a6,5, a7);
        ArbolBin<Integer> a4 = new ArbolBin<>(new ArbolBin<>(),4,new ArbolBin<>());
        ArbolBin<Integer> a3 = new ArbolBin<>(new ArbolBin<>(),3,new ArbolBin<>());
        ArbolBin<Integer> a2 = new ArbolBin<>(a3,2,a4);
        return new ArbolBin<>(a2,1,a5);

    }


    public static ArbolBin<Integer> FormarArbolBinario() {
        //ArbolBin<Integer> a8 = new ArbolBin<>(new ArbolBin<>(),50,new ArbolBin<>());
        //ArbolBin<Integer> a7 = new ArbolBin<>(new ArbolBin<>(),40,a8);
        //ArbolBin<Integer> a6 = new ArbolBin<>(new ArbolBin<>(),25,new ArbolBin<>());
        //ArbolBin<Integer> a5 = new ArbolBin<>(a6,30, a7);
        ArbolBin<Integer> a4 = new ArbolBin<>(new ArbolBin<>(),15,new ArbolBin<>());
        ArbolBin<Integer> a3 = new ArbolBin<>(new ArbolBin<>(),5,new ArbolBin<>());
        ArbolBin<Integer> a2 = new ArbolBin<>(a3,10,a4);
        return new ArbolBin<>(a2,20,new ArbolBin<>());

    }



}//class






