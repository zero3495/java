package Ch06.HW0708;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRectangle R1 = new MyRectangle();
		R1.width = 10;
		R1.depth = 20;
		System.out.println(R1.getArea());
		MyRectangle R2 = new MyRectangle(10,20);
		System.out.println(R2.getArea());
		System.out.println(R1.equals(R2));
		
	}

}
