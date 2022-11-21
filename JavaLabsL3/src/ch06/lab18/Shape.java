package ch06.lab18;

abstract public class Shape {
	@SuppressWarnings("unused")
	private int data = 50;
	
	public double getShapeArea() {
		return 100; 
	}

	abstract public double getArea();
}
