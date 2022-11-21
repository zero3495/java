package Ch09.HW04;

import java.util.Arrays;

public class sortStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪", "黃美華", 
				"劉雪麗", "黃彬彬", "潘美雪", "潘美雪" };
		Arrays.sort(str, new CPRTString());// 此排序地2個參數需要設定一個比較規則的方法。
		//比較方式為類別內的指定參考時，若參考為八大類別可以直接相減做比較，但因String類別結構方式特殊，
		//若要做排序比較的思路較為困難，還好有.compareTo()方法可使用。
		//Comperator排列規則: 正數(包括零)不換，負數交換。採二元樹排列法。
		for (String s : str) {
			System.out.println(s);
		}
	}

}
