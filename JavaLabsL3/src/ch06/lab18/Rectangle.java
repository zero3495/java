package ch06.lab18;

public class Rectangle extends Shape {

	private double width;   // 矩形的寬(width)

	private double height;  // 矩形的高(height)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}	
	
}
