package mysql.ex03.insert._02;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class InsertBook_OK {
	static String insertBookString = "";
	public static void main(String args[]) {
		setSQLCOmmand();
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(), 
					SystemConstant.getPassword());				
			PreparedStatement stmt = conn.prepareStatement(insertBookString);
		) {
			stmt.setString(1, "資料庫概論");
			stmt.setString(2, "劉心心");
			stmt.setDouble(3, 430.0);
			stmt.setBlob(4, (Blob)null);
			stmt.setDouble(5, 1.0);
			stmt.setString(6, "");
			stmt.setInt(7, 40);
			stmt.executeUpdate();
			System.out.println("新增一筆Book_JDBC之紀錄成功");
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
	}
	
	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		insertBookString = "INSERT INTO Book_JDBC "
			 + "(title, author, price, coverImage, discount, fileName, stock) " 
		     + " VALUES "
		     + "(?, ?, ?, ?, ?, ?, ?) ";
	}
}