package Ch06;

import java.util.Arrays;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 3, 5, 2, 6, 1, 4, 7, 9, 8 };
		//System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(mySort(array)));
	}

	public static int[] mySort(int[] arrayInt) {
		int[] a = arrayInt;
		for (int x = 0; x < a.length; x++) {
			for (int y = x; y < a.length; y++) {
				if (a[x] > a[y]) {
					int temp = a[x];
					a[x] = a[y];
					a[y] = temp;
				}
			}
		}
		return a;
	}
}
