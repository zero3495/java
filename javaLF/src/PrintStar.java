public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 7;
		for (int n = 0; n < max; n++) {
			for (int x = 0; x < max; x++) {
				if (x <= n) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int n = max; n >= 1; n--) {
			for (int x = 0; x < max; x++) {
				if (x < n) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int n = 0; n < max; n++) {
			for (int x = 1; x <= max; x++) {
				if (x + n >= max) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int n = 0; n < max; n++) {
			for (int x = 0; x < max; x++) {
				if (x >= n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}