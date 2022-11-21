package ch07.lab08_2;

public class Service {
	private double totalArea = 0;

	public void addArea(IShape iShape) {
		totalArea += iShape.getArea();
	}

	public double getTotalArea() {
		return totalArea;
	}
}
