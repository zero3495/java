package ch03.lab01;

// 練習目的：了解變數一定要有初值才能參與運算

public class ProgramCh03Lab01 {
	@SuppressWarnings("unused")
	public static void main(String args) {
		int i = 1;
		int j = 2;
		int sum = i + j;    // i, j 沒有初始值
		System.out.println("本程式有何問題 ?");
	}
}
