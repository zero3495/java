package ch07.lab08_1;

public class Bar {
	private double totalArea = 0;

	public void addArea(IShape iShape) {
		totalArea += iShape.getArea();
	}

	public double getTotalArea() {
		return totalArea;
	}

}
