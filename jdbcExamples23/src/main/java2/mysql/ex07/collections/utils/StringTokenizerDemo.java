package mysql.ex07.collections.utils;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "Kitty , Mickey , Snoopy , Garfield";
		StringTokenizer st = new StringTokenizer(s, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("token=" + token + "*");
		}
	}
}
