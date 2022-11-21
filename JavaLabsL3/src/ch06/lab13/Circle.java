package ch06.lab13;

public class Circle {
	public double radius;

	public Circle(double R) {
		radius = R;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}
