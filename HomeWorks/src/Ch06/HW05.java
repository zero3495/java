package Ch06;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int times = 0;
		double avg = 0;
		String s;
		while (true) {
			int i = 0;
			if (scan.hasNext()) {
				s = scan.next();
				System.out.println(s);
				if (s.equals("quit")) {
					break;
				} else {
				i = Integer.valueOf(s);
				sum += i;
				System.out.println(sum);
				}
				if (max < i) {
					max = i;
				}
				if (min >= i) {
					min = i;
				}
			}
			times++;
		}
		avg  = (double)sum/times;
		scan.close();
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
