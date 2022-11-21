package ch07._01_static.staticBlock;

//說明螢幕上會出現些訊息。
class StaticDemo {
	static {//靜態區塊 JVM會呼叫它 功用:賦予程式執行所需要的結果
		System.out.println("S1");
	}
	static {
		System.out.println("SD-01");
	}
}

public class StaticCodeBlockTest {
	static {
		System.out.println("SCB-A");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		System.out.println("SCB-C");
	}

	static {
		System.out.println("SCB-B");
	}
}
