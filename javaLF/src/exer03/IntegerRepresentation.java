package exer03;
import exer00.SystemConstant;
public class IntegerRepresentation {
	public static void main(String[] args) {
		int n = 32517;
		
		System.out.println(" 2進位: " + Integer.toBinaryString(n) );
		System.out.println(" 8進位: " + Integer.toOctalString(n) );
		System.out.println(" 16進位: " + Integer.toHexString(n) );
		double amount = 1500;
		System.out.println("顯示利息: "+amount*SystemConstant.VAT);
	}
}
