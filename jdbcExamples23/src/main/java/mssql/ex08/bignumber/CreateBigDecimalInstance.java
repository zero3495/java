package mssql.ex08.bignumber;

import java.math.BigDecimal;

public class CreateBigDecimalInstance {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 2.67;
		BigDecimal bd1 = new BigDecimal(d1);   	// NG
		BigDecimal bd2 = new BigDecimal(d2);	// NG
		System.out.println("NG bd1.toString(): " + bd1.toString());
		System.out.println("NG bd2.toString(): " + bd2.toString());
		System.out.println("---------------------------------------------");
		// 建構物件-OK作法
		bd1 = new BigDecimal(String.valueOf(d1));  
		bd2 = new BigDecimal(String.valueOf(d2));
		System.out.println("OK bd1.toString(): " + bd1.toString());
		System.out.println("OK bd2.toString(): " + bd2.toString());
		System.out.println("---------------------------------------------");
		bd1 = BigDecimal.valueOf(d1);  
		bd2 = BigDecimal.valueOf(d2);
		System.out.println("OK bd1.toString(): " + bd1.toString());
		System.out.println("OK bd2.toString(): " + bd2.toString());
	}
}


