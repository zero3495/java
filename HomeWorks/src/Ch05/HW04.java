package Ch05;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ca[] = { "snoopy", "micky", "lucky", "kitty", "derby" };
		int count = 0;
		for (int x = 0; x < ca.length; x++) {
			for (int n = 0; n < ca[x].length(); n++) {
				boolean inTheRule = 
						ca[x].charAt(n) == 'a'||
						ca[x].charAt(n) == 'e'||
						ca[x].charAt(n) == 'i'||
						ca[x].charAt(n) == 'o'||
						ca[x].charAt(n) == 'u';
				if(inTheRule) {
					count++;
				}
			}
		}
		System.out.println("字母(a,e,i,o,u)總共有" + count + "個。");

	}

}
