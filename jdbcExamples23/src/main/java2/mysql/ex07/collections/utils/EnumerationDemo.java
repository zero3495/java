package mysql.ex07.collections.utils;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<Number> v = new Vector<>();
		v.add(Integer.valueOf(100));
		v.add(101);            				// AutoBoxing
		v.add(Double.valueOf(3.14));
		v.add(6.28);            			// AutoBoxing
		v.add(Long.valueOf(1258700));
		v.add(10000000000000L);            	// AutoBoxing
		Enumeration<Number> e =  v.elements();//Vector類別其中一個方法，可以喚出Enumeration物件。
		double sum = 0;
		while (e.hasMoreElements()) {//Enumeration e.hasMoreElements()為判斷還有沒有東西。相關資訊在JDBC講義P114
			Number num = e.nextElement();//Enumeration e.nextElement()拿取資料，指標跳下一份資料。
			System.out.println("num=" + num);
			sum += num.doubleValue();
		}
		System.out.println("sum=" + sum);
		
	}
}
