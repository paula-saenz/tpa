import java.util.Locale;

public class array_ordenado {

    public static boolean ordenado (String a,int x, int i, int f){
        if(a.length()>1){
            if(i+1>=f || x>f){
                return true;
            }else{
                if(a.charAt(i)>a.charAt(x)){
                    return false;
                }else{
                    return ordenado(a,x+1,i+1,f);
                }
            }
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String a = "abhde";
        System.out.println(ordenado(a,1,0,a.length()));
    }
}
