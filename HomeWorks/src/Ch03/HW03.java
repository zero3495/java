package Ch03;
import java.util.Scanner;

public class HW03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int x = 0, y = 0;
			System.out.println("請輸入兩個整數: ");
			if (scan.hasNextInt()) {
				x = scan.nextInt(); // 讀取這個整數
			}
			if (scan.hasNextInt()) {
				y = scan.nextInt(); // 讀取這個整數
			}
			System.out.println("和 = " + (x + y));
			System.out.println("差 = " + (x - y));
			System.out.println("積 = " + (x * y));
			System.out.println("商 = " + (x / y));
			System.out.println("餘數 = " + (x % y));
			scan.close();
		}

}
