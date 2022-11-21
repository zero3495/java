
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr2D = { { 11, 25, 34 }, { 20, 37, 22, 18 }, { 15, 18, 17, 36, 25, 79 } };
		System.out.println(arr2D.length);// 3
		System.out.println(arr2D[0].length);// 3
		System.out.println(arr2D[1].length);// 4
		System.out.println(arr2D[2].length);// 6
		System.out.println(arr2D[0][0] + ", " + arr2D[0][1] + ", " + arr2D[0][2]);
		System.out.println(arr2D[1][0] + ", " + arr2D[1][1] + ", " + arr2D[1][2] + ", " + arr2D[1][3]);
		System.out.println(arr2D[2][0] + ", " + arr2D[2][1] + ", " + arr2D[2][2] + ", " + arr2D[2][3] + ", "
				+ arr2D[2][4] + ", " + arr2D[2][5]);

		// int[] arr1D = { 30, 25, 49 };
		// System.out.println(arr1D.length);
		// System.out.println(arr1D[0]);
		// System.out.println(arr1D[1]);
		// System.out.println(arr1D[2]);
		//陣列不等長的加總呢?(等行加總)
				int max = Integer.MIN_VALUE;
				for (int n = 0;n<arr2D.length;n++) {
					if(arr2D[n].length > max) {
						max = arr2D[n].length;	
					}
				}
				for (int x = 0; x < max ; x++) {
					int sum = 0;
					for (int a = 0; a < arr2D.length; a++) {
						//引入try catch
						try {
						sum += arr2D[a][x];
						}catch(ArrayIndexOutOfBoundsException e/*此為程式出現錯誤的錯誤回傳物件，可以不引入try catch試試看*/) {
							//System.out.println("arr2D["+a+"]["+x+"] error.");
						}
					}
					System.out.println("sum[?]["+ x +"]=" + sum);
				}

	}

}
