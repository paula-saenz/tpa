

public class factorial {
	
	public static long factorial (long n) {
		if (n<=1) {
			return 1;
		}else {
			return n * (factorial(n-1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(2));
		System.out.println(factorial(21));
		System.out.println(factorial(20));
	}

}
