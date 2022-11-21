
public class StaticMethod {

	public static void main(String[] args) {
		double d1 = Math.random();
		double d2 = Math.random();
		System.out.println("d1 =" + d1);
		System.out.println("d2 =" + d2);
		System.out.println("=====================");
		
		double d3 = 125.78505;
		System.out.println(Math.round(d3));
		System.out.println("=====================");
		
		String s = "123";
		int n = Integer.parseInt(s);
		System.out.println("n= " + n);
		System.out.println("=====================");
		
		String ds = "3.14";
		double d4 = Double.parseDouble(ds);
		System.out.println("ds= " + d4);
		System.out.println("=====================");
		
		String ss = "Apache Tomcat";
		System.out.println("子字串=" + ss.substring(2));
		System.out.println("子字串=" + ss.substring(4,8));
		System.out.println("=====================");
		System.out.println("子字串的標註=" + ss.indexOf("Apache"));
		System.out.println("子字串的標註=" + ss.indexOf("Tom"));
		System.out.println("子字串的標註=" + ss.indexOf("Kitty"));
		
		System.out.println("=====================");
		System.out.println("子字串的標註=" + ss.lastIndexOf("Apache"));
		System.out.println("子字串的標註=" + ss.lastIndexOf("Tom"));
		System.out.println("子字串的標註=" + ss.lastIndexOf("Kitty"));
		//如何知道字串內有一個字串且該字串為字串內唯一一個?
		//indexOf & lastIndexOf 皆為同一個數且不為-1。
		String sss = "A/pa/che /Tomcat";
		int ind = sss.lastIndexOf("/");
		System.out.println("子字串=" + sss.substring(ind+1));
		
		
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.cos(Math.PI/2.0));
		System.out.println((int)Math.cos(Math.PI/2.0));
		System.out.println(Math.cos(0));
		int lo = Math.max(100, 250); 
		
		System.out.println(lo);
		System.out.println(Math.sqrt(2));
		//以上皆為類別程式
		
		System.out.println("ABCDE".length());
		//System.out.println(String.length()); 
		//此程式錯誤:length()沒有static，所以要有物件!不能用類別名稱。
		
		
	}

}
