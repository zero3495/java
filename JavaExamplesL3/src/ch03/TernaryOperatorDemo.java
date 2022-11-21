package ch03;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		long n = System.currentTimeMillis();//1970年00時00分00秒開始做計算，每過千分之一秒時間就加一。(時0~23分0~59秒0~59)
		//這樣的設置就是取隨機亂數
		System.out.println("n=" + n);
		System.out.println((n % 2 == 0 ? "偶數" : "奇數") + "，這就是三元運算的結果。" );
		//System.out.println(n % 2 == 0 ? "偶數": "奇數" + "，這就是三元運算的結果。" );
		int i = 101;
		System.out.println((i % 2 == 0 ? "偶數": "奇數") + "，這就是三元運算的結果。" );
		//System.out.println(i % 2 == 0 ? "偶數": "奇數" + "，這就是三元運算的結果。" );
		//加括號與不括號的差別。
	}

}
