package ch07.lab08_2;

public class Triangle implements IShape   {
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
