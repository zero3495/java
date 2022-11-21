package mysql.ex09.dao;

import java.sql.Blob;

import mysql.ex00.SystemUtils;
import mysql.ex03.insert._00.BookBean;

public class UpdateMain {

	public static void main(String args[]) {
		try {
			String picturePath = "data\\batchInsert\\images\\Kitty.png";
			Blob image = SystemUtils.fileToBlob(picturePath);
			String filename = SystemUtils.extractFilename(picturePath);
			BookBean bookBean = new BookBean(9, "網路概論Dao_Update", "劉曉晰Dao_Update", 350.0, image, 1.0, filename, 36);
			BookDao bookDao = new BookDaoImpl();
			bookDao.update(bookBean);
			System.out.println("修改成功");
		} catch (Exception e) {
			System.out.println("修改時發生異常：" + e.getMessage());
			e.printStackTrace();
		}
	}
}