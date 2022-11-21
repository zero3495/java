package ch10.lab06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteTextFileByLineNG{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			BufferedReader br =new BufferedReader(
				new FileReader("SourceUTF8.txt"));
			PrintWriter out = new PrintWriter(
				new FileWriter("SourceUTF8_OUT.txt"));
		){
			String line = "";
			while((line = br.readLine())!=null) {
				System.out.println(line);
				out.println(line);
			}
			System.out.println("Last line:" + line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
