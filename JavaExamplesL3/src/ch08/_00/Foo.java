package ch08._00;

public class Foo {
	public void process() {
		System.out.println("Foo類別的process()方法開始");
		Bar bar = new Bar();
		bar.divide();
		System.out.println("Foo類別的process()方法結束");
	}
}
