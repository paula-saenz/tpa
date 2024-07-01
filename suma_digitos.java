public class suma_digitos {
    public static int suma (int n, int sum){
        if(n<=0){
            return sum;
        }else{
            sum=sum+n%10;
            n=n/10;
            return suma(n,sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(12365,0));
    }
}
