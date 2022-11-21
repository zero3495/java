package ch08.lab02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;//引入此檔  ctrl + shift + O

public class ProgramCh08Lab02 {
    public static void main(String[] args)   {
 // 請去掉此行的注解
       try {
		URL seednet = new URL("http://www.seed.net.tw") ;	
		   InputStream is = seednet.openStream() ;
		   @SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream("seednet.html") ;
		   byte[] buf = new byte[512] ; 
		   int i = 0 ; 
		   while (  (i=is.read(buf)) != -1 ) {
		     fos.write(buf, 0 , i) ;
		   }
		   System.out.println("程式結束");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  // 請去掉此行的注解     
  }
}
