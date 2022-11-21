package ch05;

public class Mapper {
	
	public static void main(String args[]) {
		//String args[] : 取得使用者輸入的參數。
		//配合講義P224實作
		for (int j = 0; j < args.length; j++) {
			System.out.println("arg[" + j + "]=" + args[j]);
		}
	}
}
