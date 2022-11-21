package mysql.ex08.bignumber;

import java.math.BigDecimal;

public class CreateBigDecimalInstance {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 2.67;
		BigDecimal bd1 = new BigDecimal(d1);   	// NG  //要注意2進位輸入值很容易有顯示的誤差，(他很難用小數點模擬10進位數)
		BigDecimal bd2 = new BigDecimal(d2);	// NG  //雖然運作效能快，但我們要求的是精準
		System.out.println("NG bd1.toString(): " + bd1.toString());
		System.out.println("NG bd2.toString(): " + bd2.toString());
		System.out.println("---------------------------------------------");
		// 建構物件-OK作法
		bd1 = new BigDecimal(String.valueOf(d1));  //所以用類別的ValueOf  String版
		bd2 = new BigDecimal(String.valueOf(d2));
		System.out.println("OK bd1.toString(): " + bd1.toString());
		System.out.println("OK bd2.toString(): " + bd2.toString());
		System.out.println("---------------------------------------------");
		bd1 = BigDecimal.valueOf(d1);  //所以用類別的ValueOf  BigDecimal版
		bd2 = BigDecimal.valueOf(d2);
		System.out.println("OK bd1.toString(): " + bd1.toString());
		System.out.println("OK bd2.toString(): " + bd2.toString());
	}
}


