import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class TimeProcessing01 {

	public static void main(String[] args) {
		// 取出部分時間元素(年,月,日,時,分,秒,毫秒)
		TimeZone gmt= TimeZone.getTimeZone("GMT");
		TimeZone.setDefault(gmt); 
		Date d = new Date();
		System.out.println(d);
		TimeZone tz = TimeZone.getDefault();
		
		GregorianCalendar gc = new GregorianCalendar(); // 用來表達時間物理量的標準。有很多曆法。
		long now = System.currentTimeMillis();
		System.out.println(now);
		long totalMillis = 0;
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒 SSS毫秒");
		// Date d = new Date(Long.MAX_VALUE);//Crtl+Shift+O 兩個引入檔都有Date()，請了解兩者區別。
		// Date d = new Date(now);//Date d = new Date(); 不給值也會預設現在時間。
		String dataString = sdf1.format(now/*Date型態*/);
		sdf1.setTimeZone(tz);
		System.out.println(dataString);

		// 取出單一時間元素 包括(星期)
		int yy = gc.get(Calendar.YEAR);
		int mm = gc.get(Calendar.MONTH);
		int dd = gc.get(Calendar.DATE);
		int hh = gc.get(Calendar.HOUR);
		int ii = gc.get(Calendar.MINUTE);
		int ss = gc.get(Calendar.SECOND);
		int ms = gc.get(Calendar.MILLISECOND);

		// System.out.println(dataString);
		// System.out.println(yy +", "+mm+", "+dd+", "+hh+", "+ii+", "+ss+", "+ms);

		int totalDays = 0;
		for (int y = 1970; y < yy; y++) {
			if (gc.isLeapYear(y)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
		totalDays += dayCount(yy, mm + 1, dd -1);
		totalMillis = totalDays * 86400 * 1000L;
		System.out.println("totalMillis = " + totalMillis);
		totalMillis += hh * 60 * 60 * 1000 + ii * 60 * 1000 + ss *1000 + ms;
		System.out.println(totalMillis);
	    System.out.println(totalMillis - now);
		System.out.println((totalMillis - now)/3600000);
		/*TimeZone gmt= TimeZone.getTimeZone("GMT");
		TimeZone.setDefault(gmt); 
		Date d = new Date();
		System.out.println(d);
		GregorianCalendar  gc = new GregorianCalendar();
		long now = System.currentTimeMillis();
		System.out.println(now);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒 SSS豪秒");
//		Date d = new Date(now);
		
		String dateString = sdf1.format(now);
		
		long totalMillis = 0 ;
		
		
	    int yy = gc.get(Calendar.YEAR);
	    int mm = gc.get(Calendar.MONTH);
	    int dd = gc.get(Calendar.DAY_OF_MONTH);
	    int hh = gc.get(Calendar.HOUR_OF_DAY);
	    int ii = gc.get(Calendar.MINUTE);
	    int ss = gc.get(Calendar.SECOND);
	    int ms = gc.get(Calendar.MILLISECOND);
//	    System.out.println(dateString);
//	    System.out.println(yy + ", " + mm + ", " + dd + ", " + hh + ", " + ii+ ", " + ss + ", " + ms);
	    int totalDays = 0;
	    for (int y = 1970; y <= yy-1; y++) {
	    	if (gc.isLeapYear(y)) {
	    		totalDays += 366;
	    	} else {
	    		totalDays += 365;
	    	}
	    }
	    totalDays += dayCount(yy, mm+1, dd-1);
	    totalMillis = totalDays * 86400 * 1000L;
	    totalMillis += hh * 60 * 60 * 1000 + ii * 60 * 1000 + ss *1000 + ms;
	    System.out.println(totalMillis);
	    System.out.println(totalMillis - now);*/

	}

	public static int dayCount(int yy, int mm, int dd) {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		GregorianCalendar gc = new GregorianCalendar();
		// System.out.println(gc.isLeapYear(yy));

		if (gc.isLeapYear(yy)) {
			days[2] = 29;
		} else {
			days[2] = 28;
		}

		int total = 0;
		for (int n = 1; n <= mm - 1; n++) {
			total += days[n];
		}
		total += dd;
		// System.out.println( yy + "年" + mm +"月"+dd+"日是該年的第"+total+"天");
		return total;
	}
}
