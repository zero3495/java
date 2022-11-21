package ch10.lab05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 編寫ProgramCh10Lab05.java，在main()之內，能由輸入檔
 * Source.txt以字元為導向讀入資料，然後再將這些資料寫出到
 * 輸出檔D:\MyData.txt。
 */
public class ProgramCh10Lab05 {
	public static void main(String[] args) {
		File folder = new File("C:\\text");
		if(! folder.exists()) {
			folder.mkdir();
		}
		File outFile = new File(folder, "MyData.txt"); 
		File inFile = new File("Source.txt"); 
		
		try (
			FileReader fr = new FileReader(inFile);
			FileWriter fw = new FileWriter(outFile);
			){
			char[] c = new char[1024];
			int len = 0;
			while((len = fr.read(c)) != -1) {
				fw.write(c,0,len);
			}
			System.out.println("Happy Ending...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
