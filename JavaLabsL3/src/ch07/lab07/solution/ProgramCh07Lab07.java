package ch07.lab07.solution;

// SuperClass類別為ProgramCh07Lab06類別的父類別，
// 它Override父類別的aMethod()，請說明本程式為何有錯誤訊息。

class  SuperClass {
   final public void aMethod() {
   }
} 

public class  ProgramCh07Lab07  extends SuperClass {
   //	取消下面的註解將會產生錯誤，請說明原因
   // 子類別不能Override父類別的final方法
   /*
   public void aMethod() { 
   }
   */
} 

