package ch07.lab06;

// SuperClass類別為ProgramCh07Lab06類別的父類別，
// 請說明本程式為何有錯誤訊息。

final  class  SuperClass {
} 
/* 取消此註解將會產生錯誤，請說明原因
public class  ProgramCh07Lab06  extends SuperClass {
} 
*/

// final class 為不可繼承類別，所以若為
/*
class  SuperClass {
} 
public class  ProgramCh07Lab06  extends SuperClass {
} 
*/
//即可讓程式順利運行