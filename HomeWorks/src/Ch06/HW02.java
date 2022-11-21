package Ch06;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(9));
		
	}
	public static long factorial(int n) {
		long fact = 1;
		for(int x=1;x<=n;x++) {
			fact *= (long)x;
		}
		return fact;
	}
}
