package Ch10.HW01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class showTXTByte {

	public static void main(String[] args) {

		File inFile = new File("Source.gif");
//		File inFile = new File("Sample.txt");
		try(
				FileInputStream fis = new FileInputStream(inFile);
				BufferedInputStream bis = new BufferedInputStream(fis);

			) {
				int len;
				int howManyByte = 0 ;
				byte[] b = new byte[8192];
				while ((len = bis.read(b)) != -1) {
					howManyByte += len;
				}
				System.out.println("happy ending.");
				System.out.println("This File has " + howManyByte + " Bytes.");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 

	}

}
