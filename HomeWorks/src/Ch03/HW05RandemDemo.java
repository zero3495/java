package Ch03;

public class HW05RandemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		for (int n = 0; n < 6; n++) {
			d = (int) (Math.random() * 42) + 1;
			System.out.println(d);
		}
	}
}
