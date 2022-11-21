package ch04.lab10;

/*
 * 請編寫程式ch04.lab10.ProgramCh04Lab10，在main()之內能夠印出九九乘法表。
 */
public class ProgramCh04Lab10 {
	public static void main(String[] args) {
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				//String s = (x * y < 10 ? x * y + " " : x * y) + "";
				System.out.print(y + " X " + x + " = " + (x * y < 10 ? x * y + " " : x * y) + "  ");
			}
			System.out.println();
		}

	}
}
