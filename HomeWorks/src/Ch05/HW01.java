package Ch05;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = {84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100};
		double sum = 0, avg = 0;
		for(int x = 0; x < d.length; x++) {
			sum += d[x];
		}
		avg = sum/d.length;
		System.out.print("avg = " + avg + ", 大於平均數有: ");
		for(int x = 0; x < d.length; x++) {
			if(d[x]>avg)
				System.out.print( d[x] + "   ");
		}
		System.out.println("等數。");
		
	}

}
