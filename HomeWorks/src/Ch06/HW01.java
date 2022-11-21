package Ch06;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starSquare(16, 8);
	}

	public static void starSquare(int width, int height) {
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
