package Ch03;

public class HW02CountTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 256559;
		int day = total / (24 * 60 * 60);
		int hour = (total / (60 * 60)) % 24;
		int min = (total / 60) % 60;
		int sec = total % 60;
		System.out.println(total + "秒為 " + day +"天 "+hour+"時 "+min+"分 "+sec+"秒");
		//System.out.println((((day*24)+hour)*60+min)*60+sec == total ?"true":"false");
	}

}
