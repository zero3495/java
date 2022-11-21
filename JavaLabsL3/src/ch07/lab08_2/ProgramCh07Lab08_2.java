package ch07.lab08_2;

// 本程式要加總一組屬於Rectangle、Triangle、Circle類別之物件的面積, 
// 它們都繼承自Shape類別。執行之後, 發現有些類別的面積並不正確(為零) 
// 請利用abstract類別/方法的優點來改正本程式
// main program 
public class ProgramCh07Lab08_2 {
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
      Service service = new Service();
      for(int x = 0;x<shapes.length;x++) {
    	  service.addArea(shapes[x]);
      }
      System.out.println("總面積為(介面多型):" + service.getTotalArea() ) ;
      System.out.println("總面積為        :" + totalArea ) ;
      System.out.println("總面積為:" + Math.round(totalArea * 100) / 100.0 ) ;  // 四捨五入
   }
}

