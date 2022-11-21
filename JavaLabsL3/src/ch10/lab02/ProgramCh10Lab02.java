package ch10.lab02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
      編寫ProgramCh10Lab02.java，在main()方法內讀取專案
      下的Source.gif檔案內的資料，然後再將這些資料寫出到輸出檔
    C:\data資料夾之下，新檔名為MyData.gif。
   
       這個練習與lab01雷同，不過要加上BufferedInputStream
       與BufferedOutputStream兩個類別。

 */
public class ProgramCh10Lab02 {
	public static void main(String[] args) {
		File folder = new File("C:\\data");
		File inFile = new File("Source.gif");
		if(!folder.exists()) {
			folder.mkdirs();
		}
		File outFile = new File(folder, "MyData2.gif");
		try(
				FileInputStream fis = new FileInputStream(inFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(outFile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
			) {
				int len;
				byte[] b = new byte[8192];
				while ((len = bis.read(b)) != -1) {
					bos.write(b, 0, len);
				}
				System.out.println("happy ending.");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 

	}
}
