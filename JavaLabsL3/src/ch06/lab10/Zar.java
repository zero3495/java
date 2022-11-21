package ch06.lab10;

public class Zar {
	public long sum(int n) {
		long sum = 0;
		for (int x = 1; x <= n; x++) {
			sum += x;
		}
		return sum;
	}
	
	public long factorial(int n) {
		long fact = 1;
		for (int x = 1; x <= n; x++) {
			fact *= x;
		}
		return fact;
	}
}
