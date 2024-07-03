public class num_mayor {

    public static boolean mayor (int []a, int x, int i, int f){
        if(i>=f){
            return true;
        }else{
            int mit = (i+f)/2;
            if(x<=mit){
                return false;
            }else{
                boolean ii = mayor(a,x,i,mit);
                boolean d = mayor (a,x,mit+1,f);
                return ii && d;
            }
        }
    }

    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6};
        int x=7;
        int y=2;
        System.out.println(mayor(a,x,0,a.length-1));
        System.out.println(mayor(a,y,0,a.length-1));

    }
}
