package mysql.ex00;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;

public class SystemUtils {

	public static Blob fileToBlob(InputStream is) throws IOException, SQLException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] b = new byte[8192];
		int len = 0;
		while ((len = is.read(b)) != -1) {
			baos.write(b, 0, len);
		}
		b = baos.toByteArray();
		SerialBlob sb = new SerialBlob(b);
		return sb;
	}

	public static Blob fileToBlob(String filePath) throws IOException, SQLException {
		File imageFile = new File(filePath);
		long size = imageFile.length();
		byte[] b = new byte[(int) size];
		SerialBlob sb = null;
		try (FileInputStream fis = new FileInputStream(imageFile);) {
			fis.read(b);
			sb = new SerialBlob(b);
		}
		return sb;
	}

	public static Clob fileToClob(String textFileName) throws IOException, SQLException {
		Clob clob = null;
		try (InputStreamReader isr = new InputStreamReader(
									 new FileInputStream(textFileName), "UTF-8");
		) {
			char[] c = new char[8192];
			StringBuffer buf = new StringBuffer();
			int len = 0;
			while ((len = isr.read(c)) != -1) {
				buf.append(new String(c, 0, len));
			}
			char[] ca = buf.toString().toCharArray();
			clob = new SerialClob(ca);
		}
		return clob;
	}

	public static Clob fileToClob(String textFileName, String encoding) 
			                      throws IOException, SQLException {
		Clob clob = null;
		try (
			InputStreamReader isr = new InputStreamReader(
			                        new FileInputStream(textFileName), encoding);
		) {
			char[] c = new char[8192];
			StringBuffer buf = new StringBuffer();
			int len = 0;
			while ((len = isr.read(c)) != -1) {
				buf.append(new String(c, 0, len));
			}
			char[] ca = buf.toString().toCharArray();
			clob = new SerialClob(ca);
		}
		return clob;
	}

	public char[] clobToCharArray(Clob clob) {
		try (
			Reader rd = clob.getCharacterStream(); 
			CharArrayWriter caw = new CharArrayWriter();
		) {
			char[] ca = new char[8192];
			int len = 0;
			while ((len = rd.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
			char[] output = caw.toCharArray();
			return output;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void saveClobToFile(Clob clob, FileWriter fw) throws IOException {
		char[] ca = clobToCharArray(clob);
		fw.write(ca);
	}

	// 計算文字檔內的字元個數
	public static long meteringReader(File f10) {
		long total = 0;
		int len = 0;
		try (FileReader reader = new FileReader(f10);) {
			char[] ca = new char[8192];
			while ((len = reader.read(ca)) != -1) {
				total += len;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return total;
	}

	public static String extractFilename(String path) {
		if (path.lastIndexOf("/") != -1) {
			return path.substring(path.lastIndexOf("/") + 1);
		} else if (path.lastIndexOf("\\") != -1) {
			return path.substring(path.lastIndexOf("\\") + 1);
		} else {
			return path;
		}

	}
}
