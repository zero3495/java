package mysql.ex05.update;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import mysql.ex00.SystemConstant;
import mysql.ex03.insert._00.BookBean;

public class UpdateBook {
	static String updateBookString = "";
	public static void main(String args[]) throws  Exception {
		setSQLCOmmand();
		Blob blob = new SerialBlob(new byte[100]);
		BookBean bookBean = new BookBean(3, "網路概論第二版", "劉曉晰", 450.0, blob, 0.65, "noimage.gif", 100);
		if (update(bookBean) > 0) {
			System.out.println("成功修改BOOK_JDBC內, 主鍵值為" + bookBean.getBookId() + "的紀錄");
		} else {
			System.out.println("表格BOOK_JDBC中無紀錄可修改");				
		} 
	}
	
	private static void setSQLCOmmand() {
		updateBookString = "UPDATE Book_JDBC SET title = ?, author = ?, price = ?, "
				+ " coverImage = ?, discount = ?, fileName = ?, stock = ?  "
				+ " WHERE bookId  =  ?";
	}
	
	private static int update(BookBean bookBean) {
		int n = 0;
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(updateBookString);
		) {
			stmt.setString(1, bookBean.getTitle());
			stmt.setString(2, bookBean.getAuthor());
			stmt.setDouble(3, bookBean.getPrice());
			stmt.setBlob(4, bookBean.getCoverImage());
			stmt.setDouble(5, bookBean.getDiscount());
			stmt.setString(6, bookBean.getFileName());
			stmt.setInt(7, bookBean.getStock());
			stmt.setInt(8, bookBean.getBookId());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
		return n;
	}
	
}