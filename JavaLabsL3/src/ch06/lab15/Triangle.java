package ch06.lab15;

public class Triangle {
	public double a, h;

	public Triangle(double x, double y) {
		a = x;
		h = y;
	}
	public double getTriArea() {
		return a*h/2.0;
	}
	
	
}
