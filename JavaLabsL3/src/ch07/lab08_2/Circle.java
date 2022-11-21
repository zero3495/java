package ch07.lab08_2;

public class Circle  implements IShape  {
   double radius ; 
   Circle(double r) {
      radius = r ;
   }
   @Override
   public double getArea() {
      return Math.PI * radius * radius ;
  }	
}
