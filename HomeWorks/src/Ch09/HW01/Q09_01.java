package Ch09.HW01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Q09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list1 = new  ArrayList<>();
		list1.add(Integer.valueOf(100));
		list1.add(Double.valueOf(3.14));
		list1.add(Long.valueOf(21L));
		list1.add(Short.valueOf((short)100));
		list1.add("Kitty");
		list1.add(Integer.valueOf(200));
		list1.add(new Object());
		list1.add("Snoopy");
		list1.add(new BigInteger("1000"));

		for(Object o : list1) {
			System.out.println(o);
		}
		
		Iterator<Object> it = list1.iterator();	
		while(it.hasNext()) {
			Object o = it.next();
			if(!(o instanceof Number)) {
				it.remove();
			}
		}
		System.out.println("-----------------------");
		for(Object o : list1) {
			System.out.println(o);
		}
		
//		while(it.hasNext()) {
//			Object o = it.next();
//			System.out.println(o);	
//		}
	}

}
