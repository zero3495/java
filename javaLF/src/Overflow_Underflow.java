
public class Overflow_Underflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2147483645;
		System.out.println("n=" + n);
		n = n + 1;
		System.out.println("n=" + n);
		n = n + 1;
		System.out.println("n=" + n);
		n = n + 1;
		System.out.println("n=" + n + " 已發生溢位。");
		n = n + 1;
		System.out.println("n=" + n);
		
		n = -1;
		
		
	}

}
