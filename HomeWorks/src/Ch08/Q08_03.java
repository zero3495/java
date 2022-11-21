package Ch08;

import java.io.IOException;
import java.util.Scanner;

public class Q08_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scnner = new Scanner(System.in);
		String s = null;
		System.out.println("請輸入分數，輸入quit結束");
		while (scnner.hasNextLine()) {
			s = scnner.next();
			if(s.trim().equalsIgnoreCase("quit")) break;
			try {
				int score = Integer.parseInt(s);
				if(score> 100 || score<0) {
					throw new ScoreException(score);
				}
				System.out.println("這是一個合法分數:" + score);
			} catch (NumberFormatException e) {
				System.out.println("格式錯誤:s=" + s);
			} catch (ScoreException se) {
				System.out.println("這不是一個合法分數:" + se.score + "原因=" + se.getErrorMessage());
			}
		}
		System.out.println("程式結束");
		scnner.close();
	}
}

