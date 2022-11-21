package lab09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;

public class SystemUtils {
	public static Blob fileToBlob(InputStream is) throws Exception {
		Blob blob = null;
		byte[] b = is.readAllBytes();
		blob = new SerialBlob(b);
		return blob;
	}

	public static Blob fileToBlob2(InputStream is) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = is.read()) != -1) {
			baos.write(b, 0, len);
		}
		b = baos.toByteArray();
		Blob blob = new SerialBlob(b);
		return blob;
	}

	public static Blob fileToBlob(String filePath) throws Exception {
		// Blob blob = null;
		FileInputStream fis = new FileInputStream(filePath);
		return fileToBlob(fis);
	}

	public static Clob fileToClob(String textFileName) throws Exception {
		// ByteArrayOutputStream baos = new ByteArrayOutputStream();
		CharArrayWriter caw = new CharArrayWriter();
		try (FileInputStream fis = new FileInputStream(textFileName);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");) {
			int len = 0;
			char[] ca = new char[1024];
			while ((len = isr.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
		}
		Clob clob = new SerialClob(caw.toCharArray());
		return clob;
	}

	public static Clob fileToClob(String textFileName, String encoding) throws Exception {
		CharArrayWriter caw = new CharArrayWriter();
		try (FileInputStream fis = new FileInputStream(textFileName);
				InputStreamReader isr = new InputStreamReader(fis, encoding);) {
			int len = 0;
			char[] ca = new char[1024];
			while ((len = isr.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
		}
		Clob clob = new SerialClob(caw.toCharArray());
		return clob;

	}

	public char[] clobToCharArray(Clob clob) throws Exception {
		char[] ca = new char[1024];
		int len = 0;
		
		try(
				Reader reader = clob.getCharacterStream();
				CharArrayWriter caw = new CharArrayWriter();
		){
			while((len = reader.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
			ca = caw.toCharArray();
		}
		return ca;
	}

	public byte[] blobToByteArray(Blob blob) throws Exception {
		byte[] ba = null;
		InputStream is = blob.getBinaryStream();
		ba = is.readAllBytes();
		return ba;
	}

	public static void blobToFile(Blob blob, File file) throws Exception {
		byte[] ba = null;
		try(
			InputStream is = blob.getBinaryStream();
			FileOutputStream fos = new FileOutputStream(file);
		){
			ba = is.readAllBytes();
			fos.write(ba);
		}
	}

	public static void clobToFile(Clob clob, File file) throws Exception {
		char[] ca = new char[1024];
		try(
				Reader reader = clob.getCharacterStream();
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw =
						new OutputStreamWriter(fos,"UTF-8");
			){
				int len = 0;
				while((len = reader.read(ca))!=-1) {
					osw.write(ca, 0, len);
				}
			}
	}
}
