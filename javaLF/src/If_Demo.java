
public class If_Demo {

	public static void main(String[] args) {
		int max = 0;
		int a = (int) (Math.random() * 11) - 5;
		int b = (int) (Math.random() * 11) - 5;
		System.out.println("a=" + a + ",b=" + b);
		/*
		 * if (a > b) { max = a; } else { max = b; }
		 */
		max = (a > b ? a : b);
		System.out.println("max = " + max);

		/*
		 * int s = (int) (Math.random() * 11) - 5; System.out.println(s); if (s % 2 ==
		 * 0) { System.out.println("變數s是偶數"); } else { System.out.println("變數s是奇數"); }
		 * 
		 * System.out.println("程式結束");
		 */

	}
}
