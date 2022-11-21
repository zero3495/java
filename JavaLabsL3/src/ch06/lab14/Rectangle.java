package ch06.lab14;
//Rectangle r = new Rectangle(10, 5);
//System.out.println(r.getRectArea());
public class Rectangle {
	public double a, b;
	public Rectangle(double i, double j) {
		a=i;
		b=j;
	}
	public double getRectArea() {
		return a*b;
	}
	
}
