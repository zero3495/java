package Ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Q08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodA();
		System.err.println("Progarm ends");
	}
	@SuppressWarnings("unused")
	static void methodA() {
		
		try {
			int i =  3 / 0;
		} catch (ArithmeticException e1) {
			//e1.printStackTrace();
		} 
		try {
			URL urlA = new URL("http://www.seed.net.tw");
		} catch (MalformedURLException e2) {
			// e2.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("D:\\Test.txt");
			fis.close();
		} catch (FileNotFoundException e3) {
			//e3.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
