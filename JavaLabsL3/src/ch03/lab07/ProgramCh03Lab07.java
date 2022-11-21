package ch03.lab07;
/*
  請編寫程式ch03.lab07.ProgramCh03Lab07，在main()之內
  請計算89個雞蛋是多少打又多少個。
*/
public class ProgramCh03Lab07 {
    public static void main(String[] args) {
    	int eggs = 89;
    	System.out.println("89個雞蛋是"+ (eggs / 12) +"打又"+(eggs % 12)+"個。");
    	int lines = 289;
    	double pages = 20.0;
    	System.out.println("289行文字可以印出"+ (lines / pages) +"頁又"+(lines % pages)+"行。");
    	System.out.println("289行文字可以印出"+ (int)Math.ceil(lines / pages) +"頁。");
    	//eggs = (int) Math.ceil(pages);
    }
}
