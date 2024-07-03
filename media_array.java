public class media_array {

    public static int media (int[]a){
        return suma(a,0,a.length-1)/a.length;
    }
    public static int suma (int [] a, int i, int f){
        if(i==f){
            return a[i];
        }else{
            int mit = (i+f)/2;
            int iz = suma(a,i,mit);
            int dr = suma(a,mit+1,f);
            return iz + dr;
        }
    }

    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,8,7,6,5,10};
        System.out.println(media(a));
    }
}
