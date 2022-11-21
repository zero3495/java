package Ch09.HW03;

import java.util.ArrayList;
import java.util.Collections;

public class sortDouble {
	public ArrayList<Double> sortList(Double[] number){
		ArrayList<Double> list1 = new ArrayList<>();
		for(Double num : number) {
			list1.add(num);
		}
		Collections.sort(list1);
		return list1;
	}
	public ArrayList<Double> setList(Double[] number){
		ArrayList<Double> list2 = new ArrayList<>();
		for(Double num : number) {
			list2.add(num);
		}
		return list2;
	}
	
}
