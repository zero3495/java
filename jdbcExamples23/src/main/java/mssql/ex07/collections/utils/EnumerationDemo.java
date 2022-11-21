package mssql.ex07.collections.utils;

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
		Enumeration<Number> e =  v.elements();
		double sum = 0;
		while (e.hasMoreElements()) {
			Number num = e.nextElement();
			System.out.println("num=" + num);
			sum += num.doubleValue();
		}
		System.out.println("sum=" + sum);
		
	}
}
