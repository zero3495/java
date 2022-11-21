package mssql.ex08.bignumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperation {
	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 2.67;
		BigDecimal bd1 = new BigDecimal(String.valueOf(d1));
		BigDecimal bd2 = new BigDecimal(String.valueOf(d2));
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("BigDecimal物件(3.14 + 2.67)相加: " + bd3.toString());
		System.out.println("---------------------------------------------");
		bd3 = bd1.subtract(bd2);
		System.out.println("BigDecimal物件(3.14 - 2.67)相減: " + bd3.toString());
		System.out.println("---------------------------------------------");
		bd3 = bd1.multiply(bd2);
		System.out.println("BigDecimal物件(3.14 * 2.67)相乘: " + bd3.toString());
		System.out.println("---------------------------------------------");
		// bd3 = bd1.divide(bd2);
		// 第二個參數: scale，第三個參數: RoundingMode
		bd3 = bd1.divide(bd2, 8, RoundingMode.HALF_UP);
		System.out.println("BigDecimal物件(3.14 / 2.67)相除: " + bd3.toString());
		bd3 = bd1.divide(bd2, 5, RoundingMode.HALF_UP);
		System.out.println("BigDecimal物件(3.14 / 2.67)相除: " + bd3.toString());
		bd3 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
		System.out.println("BigDecimal物件(3.14 / 2.67)相除: " + bd3.toString());
	}
}
