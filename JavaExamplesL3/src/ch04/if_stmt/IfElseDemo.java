package ch04.if_stmt;

public class IfElseDemo {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);
		System.out.println("分數=" + score);
		if (score >= 60) {
			System.out.println("萬歲");
			System.out.println("萬歲");
			System.out.println("萬歲");
		} else {
			System.out.println("沒過");
		}
	}
}
