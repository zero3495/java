package Ch08;



public class Q08_01 {
	static void subroutine(String[] ar) {
		int sum = 0;
		for(int i = 0;i<ar.length;i++) {
				try {
					sum += Integer.parseInt(ar[i]);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("讀入字串:(" + ar[i] + ")不是整數字串，跳過後持續計數。");
					//e.printStackTrace();
				}finally{
					System.out.println("計算第" + (i+1) +"行數值。");					
				}	
		}
		System.out.println("字串陣列計算完成 sum=" + sum);
	}
	public static void main(String[] args) {
		//String[] a = {"123","789","456","ert","1000"};//測值
		//subroutine(a);
		subroutine(args);
	}
}

