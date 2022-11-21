package ch07.lab08_1;

// 本程式要加總一組屬於Rectangle、Triangle、Circle類別之物件的面積, 
// 它們都繼承自Shape類別。執行之後, 發現有些類別的面積並不正確(為零) 
// 請利用abstract類別/方法的優點來改正本程式


// 步驟一: 將Shape類別的getArea()方法修改為abstract方法。
interface IShape {
	double getArea() ;
	// 此為public abstract double getArea() ;
}

// 步驟二: 編譯本程式就可發現問題之所在。

class Rectangle implements IShape  {
   double a, b ; 
   Rectangle(double a, double b) {
     this.a = a ;
     this.b = b ;
   }
   @Override
   public double getArea() {  
     return a * b ;
   }
}

class Triangle implements IShape   {
   double a, h ;
   Triangle(double a, double h) {
      this.a = a ;
      this.h = h ;
   }	
   @Override
   public double getArea() {  
     return 0.5 * a * h ;
   }   
}

class Circle  implements IShape  {
   double radius ; 
   Circle(double r) {
      radius = r ;
   }
   @Override
   public double getArea() {
      return Math.PI * radius * radius ;
  }	
}
// main program 
public class ProgramCh07Lab08_1 {
   public static void main(String args[]) {
      Rectangle r = new Rectangle(10, 20) ;
      Triangle t = new Triangle(5, 3) ;
      Circle  c = new Circle(10) ;
      System.out.println("圓面積    = " + r.getArea() ) ;
      System.out.println("三角形面積= " + t.getArea() ) ;
      System.out.println("長方形面積= " + c.getArea() ) ;
      double totalArea = r.getArea() + 
                         t.getArea() + 
                         c.getArea() ;
      IShape[] shapes = {r,t,c};
      Bar bar = new Bar();
      for(int x = 0;x<shapes.length;x++) {
    	  bar.addArea(shapes[x]);
      }
      System.out.println("總面積為(介面多型):" + bar.getTotalArea() ) ;
      System.out.println("總面積為        :" + totalArea ) ;
      System.out.println("總面積為:" + Math.round(totalArea * 100) / 100.0 ) ;  // 四捨五入
   }
}

