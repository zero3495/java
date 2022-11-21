package ch06.lab04;

public class Foo {

	public int[] greeting() {
		System.out.println("大家好!");
		printStar(); //本類別的方法可以直接呼叫
		int[] sa = {1,2,3,4,5,6};
		return sa;
	}

	public void printStar() {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" i=" + i);
		}
	}
}
