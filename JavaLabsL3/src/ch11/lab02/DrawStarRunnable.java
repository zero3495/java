package ch11.lab02;

public class DrawStarRunnable implements Runnable {
	int max ;
	char ch ;
	
	public DrawStarRunnable(int max, char ch) {
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
