package mysql.ex11.storeProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class CreateStoredProcedure02 {
	public static void main(String args[])  {
		String dropProc = "DROP PROCEDURE IF EXISTS spInOut" ;
		String createProc =  "CREATE PROCEDURE spInOut ("
				+ " OUT count int, "
				+ " OUT maxPrice int, "
				+ " IN stockp int ) "					
				+ " BEGIN "
				+ "  SELECT count(*) INTO count FROM Book_JDBC b WHERE b.Stock >= stockp ; "
				+ "  SELECT max(b.price) INTO maxPrice FROM Book_JDBC b WHERE b.Stock >= stockp ; "
				+ "  commit ; "
				+ " END ";
		
		try(
			Connection con = DriverManager.getConnection(
									SystemConstant.getDbURL(), 
									SystemConstant.getUser(), 
									SystemConstant.getPassword());
			PreparedStatement stmtDropSP = con.prepareStatement(dropProc); 						
			PreparedStatement stmtCreateSP = con.prepareStatement(createProc); 						
		) {
			
			stmtDropSP.executeUpdate();
			System.out.println("刪除內儲程序SPInOut() OK ");
			stmtCreateSP.executeUpdate();
			System.out.println("新建內儲程序SPInOut() OK ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
