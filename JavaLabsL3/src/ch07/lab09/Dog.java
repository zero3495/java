package ch07.lab09;

public class Dog implements Weight, IFeeling {
	int dogWeight = 100;

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return dogWeight;
	}

	@Override
	public void smile() {
		System.out.println("Dog:(^W^)");

	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Dog:(TAT)");

	}
}
