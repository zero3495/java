package ch03.lab09;

/*
 請編寫程式ch03.lab09.ProgramCh03Lab09，在 main()內定義一個
 double型態的變數 d , 初值為19583.1415，

 1. 將變數d指定給float型態的變數f ;
 2. 將變數f指定給short型態的變數s ;
 3. 將變數s指定給byte型態的變數b ;
 4. 將變數d指定給int型態的變數i ;
 5. 將變數i指定給變數s ;
 6. 印出這些變數的值。


 */
public class ProgramCh03Lab09 {
	public static void main(String[] args) {
		double d = 19583.1415;
		float f = (float)d;
		short s = (short)f;
		int i = (int)s;
		
		s = (short) i ;
		
		System.out.println("d = " + d );
		System.out.println("f = " + f );
		System.out.println("s = " + s );
		System.out.println("i = " + i );
		
		
	} 
}
