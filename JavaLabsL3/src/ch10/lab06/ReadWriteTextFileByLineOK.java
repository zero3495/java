package ch10.lab06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ReadWriteTextFileByLineOK{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				FileInputStream fis =new FileInputStream("SourceBIG5.txt");
				InputStreamReader isr = new InputStreamReader(fis,"BIG5");
				BufferedReader br =new BufferedReader(isr);
				
				FileOutputStream fos = new FileOutputStream("SourceBIG5_OUT.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
				PrintWriter out = new PrintWriter(osw);
		){
			String line = "";
			while((line = br.readLine())!=null) {
				System.out.println(line);
				out.println(line);
			}
			System.out.println("Last line:" + line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
