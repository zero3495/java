package mysql.ex03.insert._03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;
import mysql.ex03.insert._00.BookBean;

public class InsertBook_Good {
	static String insertBookString = "";

	public static void main(String args[]) {
		setSQLCOmmand();
		BookBean bookBean = new BookBean(null, "網路概論", "劉曉晰", 350.0, null, 1.0, "", 36);
		save(bookBean);
	}

	private static void save(BookBean bookBean) {
		try (
				Connection conn = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(), 
						SystemConstant.getPassword());				
				PreparedStatement stmt = conn.prepareStatement(insertBookString);
			) {
				stmt.setString(1, bookBean.getTitle());
				stmt.setString(2, bookBean.getAuthor());
				stmt.setDouble(3, bookBean.getPrice());
				stmt.setBlob(4, bookBean.getCoverImage());
				stmt.setDouble(5, bookBean.getPrice());
				stmt.setString(6, bookBean.getFileName());
				stmt.setInt(7, bookBean.getStock());
				stmt.executeUpdate();
				System.out.println("新增一筆Book_JDBC之紀錄成功");
			} catch (SQLException e) {
				System.err.print("存取資料庫時發生例外: " + e);
				e.printStackTrace();
			}
	}

	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		insertBookString = "INSERT INTO Book_JDBC " + "(title, author, price, coverImage, discount, fileName, stock) "
				+ " VALUES " + "(?, ?, ?, ?, ?, ?, ?) ";
	}
}