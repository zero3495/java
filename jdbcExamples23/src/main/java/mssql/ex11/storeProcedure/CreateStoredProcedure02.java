package mssql.ex11.storeProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mssql.ex00.SystemConstant;

public class CreateStoredProcedure02 {
	public static void main(String args[])  {
		String dropProc = "IF OBJECT_ID('dbo.SPInOut', 'P') IS NOT NULL " 
		   + " DROP Procedure dbo.spInOut; ";
		String createProc =  "CREATE PROCEDURE spInOut "
				+ " @count int OUT, "
				+ " @maxPrice int OUT, "
				+ " @stock int "					
				+ " AS BEGIN "
				+ "  SELECT @count=count(*),  @maxPrice=max(price) FROM Book_JDBC WHERE Stock >= @stock "
				+ " END";
		
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
