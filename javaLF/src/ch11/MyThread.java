package ch11;

public class MyThread extends Thread{
	String name = "";
	public MyThread() {
		
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyThread開始。。。。");
		int i = 10/0;
	}
	
	
}
