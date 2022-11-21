package Ch07;

import java.util.Calendar;

class StaticCodeBlock {
		static String season ;
}

public class Q07_02 {
	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		if(month >= 2 && month <= 4) {
			StaticCodeBlock.season = "春天";
		}else if(month >=5 && month<=7) {
			StaticCodeBlock.season = "夏天";
		}else if(month >=8 && month<=10) {
			StaticCodeBlock.season = "秋天";
		}else {
			StaticCodeBlock.season = "冬天";
		}
	}
	public static void main(String[] args) {
				System.out.println(StaticCodeBlock.season);
	}
}
