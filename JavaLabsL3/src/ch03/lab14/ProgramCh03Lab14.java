package ch03.lab14;

public class ProgramCh03Lab14 {
    public static void main(String[] args) {
        //  產生 1 - 49 的亂數
        int n = (int)(Math.random()*49)+ 1 ;   // 在這裡編寫程式碼
        //int n = (int)(Math.random()*亂數可能值得個數)+ 亂數最小值 ;
        System.out.println("n=" + n);
        
         int x;
         for(x = 0 ; x<10000000 ; x++){
        	 int n1 = (int)(Math.random()*49 -5); // 在這裡有錯，找不到-5
             if( n1 == 50){
                System.out.println("找到了");
                break; 
             }
         }
         System.out.println("找不到");
         
         
         
         
    }
}
