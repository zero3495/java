package Ch05;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = {
						{  10,  35,  40, 100,  90,  85,  75,  70 },
						{  37,  75,  77,  89,  64,  75,  70,  95 },
						{ 100,  70,  79,  90,  75,  70,  79,  90 },
						{  77,  95,  70,  89,  60,  75,  85,  89 },
						{  98,  70,  89,  90,  75,  90,  89,  90 },
						{  90,  80, 100,  75,  50,  20,  99,  75 },				
						};
		for (int x = 0; x < test.length; x++) {
			int sum = 0;
			for (int n = 0; n < test[x].length; n++) {
				sum += test[x][n];
			}
			System.out.println("test第" + (x+1) + "列加總為:" + sum);
		}
		int max = Integer.MIN_VALUE;
		for (int x = 0; x < test.length; x++) {
			if(max<test[x].length) {
				max = test[x].length;
			}
		}
		for (int x = 0; x < max; x++) {
			int sum = 0;
			for (int n = 0; n < test.length; n++) {
				sum += test[n][x];
			}
			System.out.println("test第" + (x+1) + "行加總為:" + sum);
		}
	}

}
