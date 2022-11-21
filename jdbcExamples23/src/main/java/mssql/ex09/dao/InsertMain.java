package mssql.ex09.dao;

import java.sql.Blob;

import mssql.ex00.SystemUtils;
import mssql.ex03.insert._00.BookBean;

public class InsertMain {

	public static void main(String args[]) {
		try {
			String picturePath = "data\\batchInsert\\images\\Snoopy2.jpg";
			Blob image = SystemUtils.fileToBlob(picturePath);
			String filename = SystemUtils.extractFilename(picturePath);
			BookBean bookBean = new BookBean(null, "網路概論Dao", "劉曉晰Dao", 350.0, image, 1.0, filename, 36);
			BookDao bookDao = new BookDaoImpl();
			bookDao.save(bookBean);
			System.out.println("新增成功");
		} catch (Exception e) {
			System.out.println("新增時發生異常：" + e.getMessage());
			e.printStackTrace();
		}
	}
}