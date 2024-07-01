public class ej1_dv {
    public static int pos (int[]a, int[]b, int ini, int fin){
        if(ini==fin){
            return ini+1;
        }else{
            int mitad= (ini+fin)/2;
            if(a[mitad]==b[mitad]){
                return pos(a,b,mitad+1,fin);
            }else{
                return pos(a,b,ini,mitad-1);
            }
        }

    }
    public static void main(String args[]) {
        int[]a={1,2,3,4,7,6,9,10};
        int[]b={1,2,3,4,5,8,7,8};
        if(a.length  == b.length ){
            System.out.println("Primera posición diferente: " + pos(a,b,0,a.length-1));
        }else{
            System.out.println("Los arrays no tienen el mismo tamaño");

        }

    }
}
