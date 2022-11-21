package mysql;
/*
    執行本程式時，它會丟出例外，請解決本程式的問題。本程式有多個錯誤。
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProgramWithError {

	public static void main(String[] args) {
		Connection conn = null;
		Statement  stmt = null;
		String dbURL ="jdbc:mysql//127.0.0.1:3306/cmsdb?user=root&password=Do!ng123&useSSL=false&useUnicode=yes&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
		try {
			conn = DriverManager.getConnection(dbURL);
			stmt = conn.createStatement();
			stmt.executeUpdate("DROP TABLE IF EXISTS EMP");
			stmt.executeUpdate("CREATE TABLE EMP ("
					+ " EMPNO INT AUTO_INCREMENT "
					+ " NAME VARCHAR(30), "
					+ " ADDRESS VARCHAR(60), "
					+ " PRIMARY KEY(EMPNO) "
					+ " ) ENGINE=INNODB" ) ;
			System.out.println("程式已經完全正常");
		} catch (Exception e) {
			System.out.println("執行本程式時它會丟出例外，請解決本程式的問題。本程式有多個錯誤，它們都會丟出例外");
			e.printStackTrace();
		} 
	}
}
