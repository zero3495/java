package ch06.lab04;
import java.util.Arrays;

public class FooMain {
	public static void main(String[] args) {
		Foo foo = new Foo();
		int[] sa ;
		sa = foo.greeting();
		System.out.println("sa = "+ Arrays.toString(sa));
		foo.printStar();
	}
}
