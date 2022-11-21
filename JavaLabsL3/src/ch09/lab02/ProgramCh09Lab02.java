package ch09.lab02;

import java.util.ArrayList;
import java.util.Vector;

/*
編寫ProgramCh09Lab02.java，在main()之內宣告一個
ArrayList類別之物件al，其內必須存放下列資料：
  new Integer(10000)
  new Double(3.14)
  new Long(21L)
  short型別之物件(值為100)
  new Double(5.1)
  "Kitty"
  new Integer(200)
  new Object()
  建構一個Vector類別之物件v，其內必須存放下列資料：new Integer(10000)與new Integer(200)
  判斷物件al是否完全包含(containsAll())物件v
  印出物件al與物件v的元素個數
  將v轉換為元素是Integer的陣列
 */
public class ProgramCh09Lab02 {
	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<>();
		Vector<Integer> v = new Vector<>();
		a1.add(Integer.valueOf(10000));
		a1.add(Double.valueOf(3.14));
		//a1.add(3.14);//此為合法敘述  //概念:自動裝箱，因為知道這是八大型別所以自動new成一個物件。
		a1.add(Long.valueOf(21L));
		a1.add(Short.valueOf((short)100));
		a1.add(Double.valueOf(5.1));
		a1.add("Kitty");
		a1.add(Integer.valueOf(200));
		a1.add(new Object());
		v.add(100);
		v.add(200);
		System.out.println(a1.containsAll(v));
		System.out.println("a1的元素個數: " + a1.size());
		System.out.println("v的元素個數: " + v.size());
		Integer ii[] = new Integer[0];
		Object[] ia0 = v.toArray();
		Integer[] ia1 = v.toArray(ii);
		
		
	}
}
