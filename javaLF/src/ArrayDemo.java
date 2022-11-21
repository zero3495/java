
public class ArrayDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xa[] = new int[100];
		char a5[] = new char[15];
		double []a7 = new double[10];
		int ax[] = {'A','B','C','D','E','F','G','H'};//程式自動讀取陣列總個數。
		xa[0] = 100;
		xa[1] = (int)3.94;
		
		a7[0] = 6.28;
		a7[1] = 900;
		
		for(int n = 0;n<xa.length;n++) {
			System.out.println(xa[n]);
		}
		xa[0] = Math.round((float)xa[0]);
		System.out.println(xa[0]);
		xa[2]= Integer.parseInt("123");
		
		int ar[] = { 59, 27 , -18 , 98 , 10 };
		
		int sum = 0;
		for(int x :ar) {
			sum += x;
		}
		System.out.println("sum="+sum);
	}
	
}
