package mssql.ex01.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mssql.ex00.SystemConstant;

public class CreateBookTable {
	static String dropString = "";
	static String createString = "";
	public static void main(String args[]) {
		String dbURL = SystemConstant.getDbURL();//由此進入getDbURL() 可更改登入內容。
		String user = SystemConstant.getUser();
		String password = SystemConstant.getPassword();
		setSQLCOmmand();

		try (
			Connection conn = DriverManager.getConnection(dbURL, user, password);				
			PreparedStatement stmt1 = conn.prepareStatement(dropString);
			PreparedStatement stmt2 = conn.prepareStatement(createString);
		) {
		//  執行SQL命令
			stmt1.executeUpdate();
			stmt2.executeUpdate();
			System.out.println("新建Book_JDBC表格成功");
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
			return;
		}
	}
	
	private static void setSQLCOmmand() {
		// 新建Book_JDBC表格
		dropString = "IF OBJECT_ID('dbo.Book_JDBC', 'U') IS NOT NULL " 
				   + " DROP TABLE dbo.Book_JDBC; ";
		createString = "CREATE TABLE Book_JDBC ( "
				     + " bookId 	INTEGER NOT NULL IDENTITY, "
				     + " title 		VARCHAR(255),			" 
				     + " author 	VARCHAR(255),			"
				     + " price 		DECIMAL(10, 1),			" 
				     + " coverImage IMAGE,					"
				     + " discount 	DECIMAL(7, 3),			"
				     + " fileName 	VARCHAR(255),			"
				     + " stock 		INTEGER,				"
				     + " PRIMARY KEY (bookId)			"
				     + ")"; 
	}
}