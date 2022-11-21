package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 練習目的：使用java.sql.DriverManager提供三個方法來建立Java程式與資料庫的連線
 
 這三個方法分別是:
 Connection getConnection(String url)
 Connection getConnection(String url, Properties info) 
 Connection getConnection(String url, String userId, String password)
 這三種版本的功能完全相同，只是提供登入資料庫所需之帳密的方式不一樣。

 連線資訊如下：
 DriverManager.getConnection()三種Overload版本。
 使用者代號:root
 使用者密碼:password
 資料庫url: jdbc:mysql://localhost:3306/jdbcdb
 
 MySQL的JDBC驅動程式的主類別:com.mysql.jdbc.Driver (JDBC 4.0以後不再需要此訊息)

 你可能需要替專案加入MySQL JDBC驅動程式庫。
 */
public class SetDBConnection {
	Connection con = null;

	public void connectDB1() {
		String dbURL = "";
		try {
			// 下列方法有一個參數
			con = DriverManager.getConnection(dbURL);
			System.out.println("第一種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB1()內的連線參數");
			} else {
				System.err.print("第一種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	public void connectDB2() {
		String dbURL = "";
		try {
			// 下列方法應該有兩個參數，請修改它
			con = DriverManager.getConnection(dbURL);
			System.out.println("第二種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB2()內的連線參數");
			} else {
				System.err.print("第二種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	public void connectDB3() {
		String dbURL = "";
		try {
			// 下列方法應該有三個參數，請修改它
			con = DriverManager.getConnection(dbURL);
			System.out.println("第三種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB3()內的連線參數");
			} else {
				System.err.print("第三種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	private void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SetDBConnection e01 = new SetDBConnection();
		e01.connectDB1();
		e01.connectDB2();
		e01.connectDB3();
		e01.close();
	}
}
