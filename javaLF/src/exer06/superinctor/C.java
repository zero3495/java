package exer06.superinctor;

public class C extends B {
	int z = (int) (Math.random() * 100) + y;

	public C() {
		super();
	}

	public C(int z) {
		this.z = z;
	}

	public void displayData() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("z =" + z);
	}

	
}
