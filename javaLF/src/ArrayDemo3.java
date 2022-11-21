
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = { { 11, 25, 22 ,18 }, { 20, 37, 22, 18 }, { 15, 18, 17, 36 } };
		//印出每列加總
		for (int a = 0; a < arr2D.length; a++) {
			int sum = 0;
			for (int x = 0; x < arr2D[a].length; x++) {
				sum += arr2D[a][x];
			}
			System.out.println("sum["+ a +"][?]=" + sum);
		}
		//概念
		/* 	int sum = 0;
		 * 	for (int x = 0; x < arr2D[0].length; x++) {
		 * 		sum += arr2D[0][x];
		 *  } 
		 *  System.out.println("sum=" + sum); 
		 *  sum = 0; 
		 *  for (int x =0; x < arr2D[1].length; x++) { 
		 * 		sum += arr2D[1][x]; 
		 * 	}
		 * 	System.out.println("sum=" + sum); 
		 * 	sum = 0; for (int x = 0; x <arr2D[2].length; x++) {
		 * 		sum += arr2D[2][x]; 
		 * 	} 
		 * 	System.out.println("sum=" +sum);	
		 */
		//印出每行加總 陣列等長
		/*for (int x = 0; x < arr2D[0].length; x++) {
			int sum = 0;
			for (int a = 0; a < arr2D.length; a++) {
				sum += arr2D[a][x];
			}
			System.out.println("sum[?]["+ x +"]=" + sum);
		}*/
		
	}

}
