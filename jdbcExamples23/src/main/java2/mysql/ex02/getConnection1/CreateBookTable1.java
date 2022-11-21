package mysql.ex02.getConnection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;
// 使用一個參數的getConnection()方法
public class CreateBookTable1 {
	static String dropString = "";
	static String createString = "";
	public static void main(String args[]) {
		String dbURL = SystemConstant.getDbURL() + "&user=root&password=Do!ng123";
		setSQLCOmmand();
		
		try (
			Connection conn = DriverManager.getConnection(dbURL);				
			PreparedStatement stmt1 = conn.prepareStatement(dropString);
			PreparedStatement stmt2 = conn.prepareStatement(createString);
		) {
		//  執行SQL命令
			stmt1.executeUpdate();
			stmt2.executeUpdate();
			System.out.println("新建Book_JDBC表格成功：使用一個參數的getConnection()方法");
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
			return;
		}
	}
	
	private static void setSQLCOmmand() {
		// 新建Book_JDBC表格
		dropString =   " DROP TABLE IF EXISTS Book_JDBC; ";
		createString = "CREATE TABLE Book_JDBC ( "
				     + " bookId 	INTEGER NOT NULL AUTO_INCREMENT, "
				     + " title 		VARCHAR(255),			" 
				     + " author 	VARCHAR(255),			"
				     + " price 		DECIMAL(10, 1),			" 
				     + " coverImage LONGBLOB,					"
				     + " discount 	DECIMAL(7, 3),			"
				     + " fileName 	VARCHAR(255),			"
				     + " stock 		INTEGER,				"
				     + " PRIMARY KEY (bookId)			"
				     + ")"; 
	}
}