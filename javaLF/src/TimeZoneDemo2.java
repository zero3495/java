import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class TimeZoneDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		sdf.setTimeZone(tz);
		String timeNY = sdf.format(now);
		System.out.println(timeNY);
		
		tz = TimeZone.getTimeZone("Asia/Tokyo");
		sdf.setTimeZone(tz);
		String timeTK = sdf.format(now);
		System.out.println(timeTK);
		//America/New_York
		//Asia/Taipei
	}

}
