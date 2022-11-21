package ch04.lab05;

// 使用for 敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20 的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab05 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i <= 20; i++) {
			sum1 += i;
			if (i % 2 == 0) {
				sum2 += i;
			} else {
				sum3 += i;
			}
		}

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
