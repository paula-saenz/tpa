public class suma_num_array {

    public static int sumar_l (int[] a, int i, int f){
        if(i==f) {
            return a[i];
        }else{
            int mit = (i+f)/2;
            int iz= sumar_l(a,i,mit);
            int dr = sumar_l(a,mit+1,f);
            return iz+dr;
        }
    }

    public static void main(String[] args) {
        int[]a={1, 2, 5, 4, 12, 3, 4, 5, 6, 5, 43};
        System.out.println(sumar_l(a,0,a.length-1));
    }
}
