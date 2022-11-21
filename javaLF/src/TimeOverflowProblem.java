import java.util.GregorianCalendar;

public class TimeOverflowProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = Integer.MAX_VALUE;
//		System.out.println("time is :" + time);
		int year = CountYearPass(time);
		int timeRemainingbyCutYear = getTimeRemainingbyCutYear(time, year);
//		System.out.println(time);
		int month = countMonthPass(timeRemainingbyCutYear,year);
		int timeRemainingbyCutMonth = getTimeRemainingbyCutMonth(timeRemainingbyCutYear, year,month);
//		System.out.println(time);
//		System.out.println("year : " + year );
//		System.out.println("month : " + month );
//		System.out.println("day : " + countDay(timeRemainingbyCutMonth) );
//		System.out.println("hour : " + countHour(timeRemainingbyCutMonth));
//		System.out.println("MIN : " + countMIN(timeRemainingbyCutMonth) );
//		System.out.println(countSEC(timeRemainingbyCutMonth));
		System.out.println(year + "年" + month + "月" + countDay(timeRemainingbyCutMonth) + "日" + countHour(timeRemainingbyCutMonth) + "時" + countMIN(timeRemainingbyCutMonth) + "分" + countSEC(timeRemainingbyCutMonth) + "秒後，會發生時間溢位問題。");
		
		

	}

	public static int CountYearPass(int time) {
		GregorianCalendar gc = new GregorianCalendar();
		int yearCount = 1970;
		for (long timeYear = 0; timeYear < time; timeYear += (gc.isLeapYear(yearCount) ? 366 * 86400 : 365 * 86400)) {
			yearCount++;
		}
		return yearCount - 1;
	}

	public static int getTimeRemainingbyCutYear(int time, int year) {
		GregorianCalendar gc = new GregorianCalendar();
		int timePassOfYear = 0;
		for (int YearStart = 1970; YearStart < year; YearStart++) {
			timePassOfYear += (gc.isLeapYear(YearStart) ? 366 * 86400 : 365 * 86400);
		}
		return time - timePassOfYear;
	}

	public static int countMonthPass(int time,int year) {
		GregorianCalendar gc = new GregorianCalendar();
		int[] monthArray = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if(gc.isLeapYear(year)) {
			monthArray[2] = 29;
		}
		int monthCount = 1;
		for (int timeMonth = 0; timeMonth <= time; timeMonth += monthArray[monthCount]* 86400) {
			monthCount++;
		}
		return monthCount - 1;
	}
	public static int getTimeRemainingbyCutMonth(int time, int year, int month) {
		GregorianCalendar gc = new GregorianCalendar();
		int timePassOfMonth = 0;
		int[] monthArray = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if(gc.isLeapYear(year)) {
			monthArray[2] = 29;
		}
		for (int MonthStart = 1; MonthStart < month; MonthStart++) {
			timePassOfMonth += monthArray[MonthStart]* 86400;
		}
		return time - timePassOfMonth;
	}
	public static int countDay(int time) {
		return time/86400+1;
	}
	public static int countHour(int time) {
		return (time/3600)%24;
	}
	public static int countMIN(int time) {
		return (time/60)%60;
	}
	public static int countSEC(int time) {
		return time%60;
	}

}
