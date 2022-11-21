package ch04.lab09;

/*
 請編寫程式ch04.lab09.ProgramCh04Lab09，在main()之內能夠印出下列資料：
 1, 1
 1, 2
 1, 3
 1, 4
 1, 5
 2, 1
 2, 2
 2, 3
 2, 4
 2, 5
 3, 1
 3, 2
 3, 3
 3, 4
 3, 5

 */
public class ProgramCh04Lab09 {
	public static void main(String[] args) {
		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.println(" " + x +", " + y);
			}
		}

	}
}
