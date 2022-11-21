package ch04.nestedLoop;
//附帶 標籤break 的使用
public class NestedLoopDemo {
	public static void main(String[] args) {
		int x, y;
		abc: for (x = 1; x <= 9; x++) {
			 	 for (y = 1; y <= 9; y++) {
					 System.out.println("x=" + x + ", y=" + y);
					 if (y % 5 == 0) {
						 break abc;
					 }
				 }
				 System.out.println();
		}
	}
}
