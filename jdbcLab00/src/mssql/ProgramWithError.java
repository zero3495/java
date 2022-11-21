package mssql;
/*
    執行本程式時，它會丟出例外，請解決本程式的問題。本程式有多個錯誤。
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProgramWithError {

	public static void main(String[] args) {
		Connection conn = null;
		Statement  stmt = null;//    :
		String dbURL ="jdbc:sqlserver://localhost:1433;databaseName=cmsdb;user=sa;password=sa123456";
		try { 
			conn = DriverManager.getConnection(dbURL);
			stmt = conn.createStatement();
			stmt.executeUpdate("IF OBJECT_ID('dbo.EMP', 'U') IS NOT NULL DROP TABLE dbo.EMP;  "); 
					           
			stmt.executeUpdate("CREATE TABLE EMP ("
					+ " EMPNO INT IDENTITY, "
					+ " NAME VARCHAR(30), "
					+ " ADDRESS VARCHAR(60), "
					+ " PRIMARY KEY(EMPNO) "
					+ " ) " ) ;
			System.out.println("程式已經完全正常");
		} catch (Exception e) {
			System.out.println("執行本程式時它會丟出例外，請解決本程式的問題。本程式有多個錯誤，它們都會丟出例外");
			e.printStackTrace();
		} 
	}
}
