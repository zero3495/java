package mysql.ex04.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class DeleteBookById {
	static String deleteBookByIdString = "";
	public static void main(String args[]) {
		int id = 2;
		setSQLCOmmand();
		if (deleteById(id) > 0) {
			System.out.println("成功刪除BOOK_JDBC內, 主鍵值為" + id + "的紀錄");
		} else {
			System.out.println("表格BOOK_JDBC中無紀錄可刪除");				
		} 
	}

	private static int deleteById(Integer id) {
		int n = 0;
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(deleteBookByIdString);
		) {
			stmt.setInt(1, id);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
		return n;
	}
	private static void setSQLCOmmand() {
		deleteBookByIdString = "DELETE FROM Book_JDBC WHERE  bookId  =  ?";
	}
}