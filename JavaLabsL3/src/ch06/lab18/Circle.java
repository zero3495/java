package ch06.lab18;


public class Circle extends Shape { 
 
	private double radius;    // 圓的半徑
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}   
	
}
