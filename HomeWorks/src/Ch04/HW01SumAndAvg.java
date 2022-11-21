package Ch04;

public class HW01SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;
		int n = 0;
		for (n = 0; n < 10; n++) {
			sum += (int)(Math.random()*100)+1;
		}
		avg=(double)sum/n;
		System.out.println("sum ="+sum);
		System.out.println("avg ="+avg);
	}

}
