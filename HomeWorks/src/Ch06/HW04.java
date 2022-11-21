package Ch06;

import java.util.Arrays;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(luckNumber()));
	}
	public static int[] luckNumber() {
		int[] a = new int[6];
			for(int x = 0; x<6;x++) {
				a[x] = (int)(Math.random()*42)+1;
			}
		return a;
	}

}
