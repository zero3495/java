package mssql.ex03.insert._01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mssql.ex00.SystemConstant;

public class InsertBook_NG {
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
		//  執行SQL命令
			stmt.executeUpdate();
			System.out.println("新增一筆Book_JDBC之紀錄成功");
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
			return;
		}
	}
	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		insertBookString = "INSERT INTO Book_JDBC "
			 + "(title, author, price, coverImage, discount, fileName, stock) " 
		     + " VALUES ('JDBC入門與進階', '張曉雅', 380.0, NULL, 1.0, '', 20) ";
	}
}