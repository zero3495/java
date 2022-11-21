package Ch06;


public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//暴力輸入測值方式
		char ch1 = '\uffff';
		char ch2 = '\u0fff';
		char ch3 = '\u00ff';
		char ch4 = '\u000f'; 
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4); //印出的值複製貼上
		String textNG = "￿"+"࿿" + "ÿ" + ""; 
		//正確輸入測值方式 優雅!
		String textOK = String.valueOf('\uffff')+String.valueOf('\u0fff')+String.valueOf('\u00ff')+String.valueOf('\u000f');
		System.out.println("\""+textOK + "\"的Unicode為" +toUnicodeString(textOK));
		System.out.println("\""+textNG + "\"的Unicode為" +toUnicodeString(textNG));
		*/
		/*
		//了解進位數與範圍
		int i = 0x10;
		System.out.println(i);
		System.out.println(Integer.valueOf('\u000f'));
		*/
		String s = "ABC";
		String s1 = "張君雅";

		
		System.out.println(toUnicodeString(s));
		System.out.println(toUnicodeString(s1));

	}
	public static String toUnicodeString(String s) {
		String unicodeString ="";
		for(int x = 0; x<s.length();x++) {
			int i = Integer.valueOf(s.charAt(x));//autoboxing & autounboxing.
			
			if(i<0x10) {
				unicodeString += "\\u000"+Integer.toHexString(i);
			}else if(i<0x100 && i>=0x10) {
				unicodeString += "\\u00"+Integer.toHexString(i);
			}else if(i<0x1000 && i>=0x100) {
				unicodeString += "\\u0"+Integer.toHexString(i);
			}else {
				unicodeString += "\\u"+Integer.toHexString(i);
			}
		}
		return unicodeString;
	}
}
