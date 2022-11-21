package ch11.lab01;

public class DrawStarThread extends Thread {
	int max ;
	char ch ;
	
	public DrawStarThread(int max, char ch) {
		super();
		this.max = max;
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int i = 1;i<=max;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
}
