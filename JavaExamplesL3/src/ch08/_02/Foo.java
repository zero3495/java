package ch08._02;

public class Foo {
	public void process() {
		try {
			System.out.println("Foo類別的process()方法開始");
			Bar bar = new Bar();
			bar.divide();
			System.out.println("Foo類別的process()方法結束");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
