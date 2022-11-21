package Ch09.HW03;

import java.util.ArrayList;


public class sortDoubleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] d = {98.0,12.345,97.85,12.0};
		ArrayList<Double> ad = new ArrayList<>();
		sortDouble list = new sortDouble();
		System.out.println("排序前:");
		ad = list.setList(d);
		for(Double num : ad) {
			System.out.println(num);
		}
		System.out.println("----------------");
		ad = list.sortList(d);
		System.out.println("排序後:");
		for(Double num : ad) {
			System.out.println(num);
		}
		System.out.println("----------------");
	}

}
