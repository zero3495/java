package Ch05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		int yyyy = 0, MM = 0, dd = 0, total = 0;
		if(scan.hasNextInt()) {
			yyyy = scan.nextInt();
		}
		if(scan.hasNextInt()) {
			MM = scan.nextInt();
		}
		if(scan.hasNextInt()) {
			dd = scan.nextInt();
		}
		total = dayCount(yyyy,MM,dd);
		System.out.println( yyyy + "年" + MM +"月"+ dd +"日是該年的第"+total+"天。");
		scan.close();
	}
	public static int dayCount(int yy,int mm, int dd) {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		GregorianCalendar gc = new GregorianCalendar();
		//System.out.println(gc.isLeapYear(yy));
		
		if(gc.isLeapYear(yy)) {
			days[2] = 29;
		}else {
			days[2] = 28;
		}
		
		int total = 0;
		for (int n = 1; n <= mm - 1; n++) {
			total += days[n];
		}
		total += dd;
		//System.out.println( yy + "年" + mm +"月"+dd+"日是該年的第"+total+"天。");
		return total;
	}
}
