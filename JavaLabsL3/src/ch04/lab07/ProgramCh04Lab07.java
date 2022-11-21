package ch04.lab07;

// 使用while敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab07 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int n = 1;
		while (n<=20) {
			sum1 += n;
			if(n%2==0) {
				sum2 += n; 
			}else {
				sum3 += n;
			}
			n++;
		}
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("sum3 = " + sum3);
		
		
		
		
	}
}
