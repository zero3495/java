package Ch09.HW02;

import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"張君雅","潘美雪","劉雪莉","黃彬彬","潘美雪","黃美華",
				"劉雪麗","黃彬彬","潘美雪","潘美雪"};
		SetDemo set = new SetDemo();
		Set<String> ans = set.setName(names);
		for(String i : ans) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
	}

}
