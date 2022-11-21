package Ch04;

public class HW02SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int n = 1; n <= 1000; n++) {
			if (n % 2 == 0) {
				sum+=n;
			}
		}
		System.out.println(sum);
	}

}
