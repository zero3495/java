package exer06.resursion;

public class ResursiveExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 0; n <= 10; n++) {
			long ans = factorial(n);
			System.out.println(n + "!=" + ans);
		}
		for (int n = 0; n <= 10; n++) {
			long ans = fibonacci(n);
			System.out.println("fibonacci(" + n + ")=" + ans);
		}
		for (int n = 0; n <= 10; n++) {
			long ans = pow(2,n);
			System.out.println("pow(2," + n + ")=" + ans);
		}

	}

	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static long fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static long pow(int base, int time) {
		if(time == 0) {
			return 1;			
		}else {
			return base * pow(base, time-1);
		}
		
	}
	
	

}
