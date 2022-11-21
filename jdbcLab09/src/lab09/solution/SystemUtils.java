package lab09.solution;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;

public class SystemUtils {
	public static Blob fileToBlob(String filename) {
		Blob blob = null;
		File f = new File(filename);
		int len = (int) f.length();
		byte[] b = new byte[len];
		try (FileInputStream fis = new FileInputStream(f);) {
			fis.read(b);
			blob = new SerialBlob(b);
		} catch (Exception ex) {
			ex.getLocalizedMessage();
		}
		return blob;
	}

   	public static Clob fileToClob(String filename, String encoding) {
		Clob clob = null;
		try (
			FileInputStream fis = new FileInputStream(filename);
			InputStreamReader in = new InputStreamReader(fis, encoding);
			CharArrayWriter caw = new CharArrayWriter();
		) {
			int len = 0;
			char[] ca = new char[8192];
			while ((len = in.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
			clob = new SerialClob(caw.toCharArray());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return clob;
	}

	
	public static void blobToFile(Blob picture, File file) {
		try (
		   InputStream is = picture.getBinaryStream();
		   OutputStream os = new FileOutputStream(file);
		) {
			byte[] b = new byte[819200];
			int len = 0 ;
			while ((len=is.read(b))!=-1){
				os.write(b, 0, len);
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
   	
	public static void clobToFile(Clob comment, File file) {
		try (
		   Reader reader =	comment.getCharacterStream();				
		   FileOutputStream fos = new FileOutputStream(file);
		   OutputStreamWriter osw = new OutputStreamWriter(fos);
		) {
			int len = 0 ;
			char[] c = new char[819200];
			while ((len=reader.read(c))!= -1){
				osw.write(c, 0, len);
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
