public class ej2_dv {

    public static int minimo_dv (int[]a, int ini, int fin){
        if(ini==fin){
            return a[ini];
        } else{
            int mitad= (ini+fin)/2;
            int mini = minimo_dv(a,ini,mitad);
            int mind = minimo_dv(a,mitad+1,fin);
            if (mini<mind){
                return mini;
            }else{
                return mind;
            }
        }
    }

    public static int minimo_it(int[]a){
        int minimo = a[0];
        for(int i=1;i<a.length;i++){
            int aux = a[i];
            if(aux<minimo){
                minimo =aux;
            }
        }
        return minimo;
    }
    public static void main(String[] args) {
        int []a={20,100,40,50,43,45,42,10,50,8,9};
        System.out.println(minimo_dv(a,0,a.length-1));
        System.out.println(minimo_it(a));


    }
}
