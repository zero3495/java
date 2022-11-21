package ch06.lab11;

public class ProgramCh04Lab11 {
	public static void main(String args[]) {
		String s1 = "readme.txt";
		String s2 = "readme.pic";
		//(判斷式?true:false) 養成想到boolean或判斷式就要連接到三元運算子!
		
		System.out.println(s1.endsWith(".txt") ? "true": "false");
		System.out.println(s2.endsWith(".txt") ? "true": "false");
		
		boolean result = s1.endsWith(".txt") ? true: false;
		System.out.println(result);
		result = s2.endsWith(".txt") ? true: false;
		System.out.println(result);
		
		System.out.println(s1.endsWith(".txt"));
		System.out.println(s2.endsWith(".txt"));
		
		
	}
}
