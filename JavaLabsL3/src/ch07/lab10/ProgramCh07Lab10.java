package ch07.lab10;

//介面練習步驟二： (本程式可執行)

//類別Vehicle有屬性如下 :
//load(double)    : 目前的載重
//maxLoad(double) : Vehicle所允許的最大載重
//任何貨物要加到Vehicle時，必需先檢查目前載重(load)加上貨物的重
//量應該小於maxLoad，否則不能加到Vehicle內。程式要求將Plane、
//Rock、Dog等類別的物件加到Vehicle物件內，因此替Vehicle設計了
//下列三個方法:
//boolean addCargo(Dog d) 
//boolean addCargo(Rock r) 
//boolean addCargo(Plane p) 
//當Plane, Rock, Dog等類別的物件加到Vehicle時必須判斷加入後的總
//載重是否小於等於允許的最大總載重(maxLoad)。
//現在請設計一個方法來取代上述的三個方法。
//提示：利用介面來簡化Vehicle類別的設計。

// 假設 interface Weight 如下:
public class ProgramCh07Lab10 {
  public static void main(String args[]) {
    Plane p1 = new Plane() ;  	
    Rock  r1 = new Rock() ;
    Dog d1 = new Dog() ;  	
    Vehicle v = new Vehicle(150000) ; 

    v.addCargo(p1) ;
    v.addCargo(d1) ;
    v.addCargo(r1); 
    System.out.println("總重量為" + v.load) ;
  }
}
