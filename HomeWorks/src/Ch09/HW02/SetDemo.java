package Ch09.HW02;


import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public Set<String> setName(String[] name){
		Set<String> set = new TreeSet<>();
		for(int i=0;i<name.length;i++) {
			set.add(name[i]);
		}
		return set;
	}
}
