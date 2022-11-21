package ch03.lab08;

public class ProgramCh03Lab08 {
/*
 請編寫程式ch03.lab08.ProgramCh03Lab08，在main()之內請將
 華氏70度轉換攝氏溫度。
 
提示1: 華氏溫度減去 32, 然後乘以 5, 再除以 9 即為攝氏溫度。
提示2: 華氏溫度-40度是攝氏溫度-40度。
提示3: 華氏溫度212度是攝氏溫度100度。

 
*/
  public static void main(String[] args) {
    double tempture1 = 70;
    double tempture2 = (tempture1-32.0)*5.0/9.0;
    System.out.println("華氏溫度" + tempture1 + "為攝氏溫度" + tempture2 );
   
  }
}
