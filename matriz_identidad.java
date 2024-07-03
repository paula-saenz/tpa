public class matriz_identidad {

    public static boolean m_id (int[][]m1,int iif, int ic, int f, int c){
        if(f<=0||c<=0){
            return true;
        }
        if (f == 1 && c == 1){
            if(iif==ic){
                return m1[iif][ic]==1;
            } else{
                return m1[iif][ic]==0;
            }
        }
        int mitf = f/2;
        int mitc = c/2;

        boolean ia = m_id(m1,iif,ic,mitf,mitc);
        boolean ib = m_id(m1,iif+mitf,ic,f-mitf,mitc);
        boolean da = m_id(m1,iif,ic+mitc,mitf,c-mitc);
        boolean db = m_id(m1,iif+mitf,ic+mitc,f-mitf,c-mitc);
        return ia && ib && da && db;
    }

    public static void main(String[] args) {
        int[][]a=   {{1,0,0,0},
                    {0,1,0,0},
                    {0,0,1,0},
                    {0,0,0,1}};

        int[][]b={{1,0,0,0},
                {0,1,2,0},
                {0,0,1,0},
                {0,0,0,1}};

        System.out.println(m_id(a,0,0,a.length-1,a[0].length-1));
        System.out.println(m_id(b,0,0,b.length-1,b[0].length-1));

    }
}
