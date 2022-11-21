package ch07.lab08_2;

public class Rectangle implements IShape  {
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
