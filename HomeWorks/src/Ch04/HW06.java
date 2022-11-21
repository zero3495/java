package Ch04;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		for (int n1 = 1; n1 <= 10; n1++) {
			for (int n2 = 1; n2 <= 10; n2++) {
				if (n1 * n2 < 10) {
					s = "  " + n1 * n2;
				} else if (n1 * n2 >= 10 && n1 * n2 < 100) {
					s = " " + n1 * n2;
				} else {
					s = "" + n1 * n2;
				}
				System.out.print(s + "  ");
			}
			System.out.println();
		}
	}

}
