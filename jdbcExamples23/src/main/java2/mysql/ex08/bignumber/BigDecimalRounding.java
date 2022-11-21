package mysql.ex08.bignumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounding {

	public static void main(String[] args) {
		double d = 0.21;
		BigDecimal bd1 = new BigDecimal(String.valueOf(d));
		//System.out.println("bd1=" + bd1);
		BigDecimal bd2 = new BigDecimal(String.valueOf(0.997));
		//System.out.println("bd2=" + bd2);
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("bd3=" + bd3);
		BigDecimal bd4 = bd1.subtract(bd2);
		System.out.println("bd4=" + bd4);
		
		BigDecimal bd6 = bd1.divide(bd2, 8, RoundingMode.HALF_UP);
		System.out.println("bd6=" + bd6);
		
		bd6 = bd1.divide(bd2, 4, RoundingMode.HALF_UP);
		System.out.println("BigDecimal.ROUND_HALF_UP, bd6=" + bd6);
		
		bd6 = bd1.divide(bd2, 4, RoundingMode.HALF_DOWN);
		System.out.println("BigDecimal.ROUND_HALF_DOWN, bd6=" + bd6);		
		
		bd6 = bd1.divide(bd2, 4, RoundingMode.FLOOR);
		System.out.println("BigDecimal.ROUND_FLOOR, bd6=" + bd6);
		
		bd6 = bd1.divide(bd2, 4, RoundingMode.CEILING);
		System.out.println("BigDecimal.ROUND_CEILING, bd6=" + bd6);		
	}
}


