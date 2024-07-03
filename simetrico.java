public class simetrico {

    public static boolean sim (int [] a, int i, int f){
        if(a.length%2!=0){
            return false;
        }else {
            boolean simetric = true;
            while (i < f && simetric) {
                if (a[i] == a[f]) {
                    i++;
                    f--;
                } else {
                    simetric = false;
                }
            }
            return simetric;
        }
    }

    public static boolean sim_rec (int [] a, int i, int f){
        if(a.length%2!=0){
            return false;
        }else {
            if(a[i]==a[f]){
                return sim(a,i+1,f-1);
            } else{
                return false;
            }
        }
    }

    public static int pos_par (int [] b, int i, int f){
        if(i>f){
            return 0;
        } else{
            int mit = (i+f)/2;
            if(b[mit]%2==0 && b[mit-1]%2!=0){
                return mit;
            }else{
                if(b[mit]%2!=0){
                    return pos_par(b,mit+1,f);
                }else{
                    return pos_par(b,i,mit);
                }
            }
        }
    }

    public static boolean simetricos(int[]a, int[]b, int i, int f){
        if(a.length%2!=0 || b.length%2!=0){
            return false;
        }else{
            if(a[i]!=b[f]){
                return false;
            }else {
                int mit =(i+f)/2;
                boolean ii = simetricos(a,b,i,mit);
                boolean d = simetricos(a,b,mit+1,f);
                return ii && d;
            }
        }
    }




        public static void main(String[] args) {
        int[]a = {1,2,3,4,4,3,2,1};
        int[]b ={1,3,7,9,4,6,8,2};

        int []c={1,2,3,4};
        int []d={4,3,2,1,5,6,7,5};

        System.out.println(sim(a,0,a.length-1));
        System.out.println(sim_rec(a,0,a.length-1));
        System.out.println(pos_par(b,0,a.length-1));

        if(c.length<d.length){
            System.out.println(simetricos(c,d,0,c.length-1));
        }else {
            System.out.println(simetricos(c,d,0,d.length-1));
        }



    }
}
