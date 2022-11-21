package ch07.lab08;

public class Foo {
	private double totalArea = 0.0;

	public void addArea(Shape s) { //處理一組不同型別的物件，要有同一種行為(方法)，如何知道?1.繼承同一個類別 2.繼承同一個介面
		totalArea += s.getArea();
	}

	public double getTotalArea() {
		return totalArea;
	}

}
