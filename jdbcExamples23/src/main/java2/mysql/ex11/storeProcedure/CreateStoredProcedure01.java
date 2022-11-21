package mysql.ex11.storeProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class CreateStoredProcedure01 {
	public static void main(String args[])  {
		String dropProc = "DROP PROCEDURE IF EXISTS spIn; ";

		String createProc =  "CREATE PROCEDURE spIn( "
				+ " title VARCHAR(255), "
				+ " author VARCHAR(255), "
				+ " price NUMERIC(12,3),  "					
				+ " coverImage Longblob,  "	
				+ " filename VARCHAR(255), "
				+ " discount NUMERIC(7,3),  "					
				+ " stock int) "					
				+ "BEGIN "
				+ "INSERT INTO Book_JDBC(title, author, price, coverImage, filename, discount, stock) "
				+ "  VALUES(title, author, price, coverImage, filename, discount, stock); "
				+ "END";
		
		try(
			Connection con = DriverManager.getConnection(
									SystemConstant.getDbURL(), 
									SystemConstant.getUser(), 
									SystemConstant.getPassword());
			PreparedStatement stmtDropSP = con.prepareStatement(dropProc); 						
			PreparedStatement stmtCreateSP = con.prepareStatement(createProc); 						
		) {
			stmtDropSP.executeUpdate();
			System.out.println("刪除內儲程序SPIn() OK ");
			stmtCreateSP.executeUpdate();
			System.out.println("新建內儲程序SPIn() OK ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
