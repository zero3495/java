package ch09.lab03;

import java.util.ArrayList;
import java.util.Iterator;
/*
 *  編寫ProgramCh09Lab03.java，承前題(lab02)，對於ArrayList 
 *  類別之物件v，請使用5.0的增強版for()來加總物件
 *  v內，所有數值性的資料 
 */
public class ProgramCh09Lab03 {
	public static void main(String[] args) {
		ArrayList<Object>  v = new ArrayList<>();
		v.add(Integer.valueOf(10000));
		v.add(3.14);
		v.add(Long.valueOf(21L));
		v.add(Short.valueOf("100"));
		v.add(Double.valueOf(5.1));
		v.add("Kitty");
		v.add(200);
		v.add(new Object());  
		double total = 0;
		for(Object o : v) {
			if( o instanceof Number) {
				Number num = (Number)o;
				total += num.doubleValue();
			}
		}
		System.out.println("total=" + total);
		total = 0;
		Iterator<Object> it = v.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof Number) {
				Number num = (Number)o;
				total += num.doubleValue();
			}
		}
		System.out.println("total=" + total);
		
		
	}
}
