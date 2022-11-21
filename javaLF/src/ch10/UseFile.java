package ch10;

import java.io.File;
import java.io.IOException;

public class UseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
//		File f0 = new File("C:\\aaa\\bbb\\ccc");
//		if(!f0.exists()) {
//			System.out.println(f0.mkdirs());//複數資料夾用方法 [物件名.mkdirs();]
//		}
//		File f1 = new File("C:\\aaa\\readme.txt");
//		System.out.println(f1.createNewFile());
//		System.out.println(f1.exists());
//		System.out.println(f1.isFile());
//		System.out.println(f1.isDirectory());
//上方再絕對位址建檔，下方在相對位置建檔:現在程式進行的位址為C:\_java\eclipse-workspace\javaLF--------		
		File f2 =new File("score.txt");
		System.out.println(f2.createNewFile());
		System.out.println(f2.exists());
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
	}

}
