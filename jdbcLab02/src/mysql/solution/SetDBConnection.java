package mysql.solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 練習目的：使用java.sql.DriverManager提供三個方法來建立Java程式與資料庫的連線
 
 DriverManager.getConnection()三種Overload版本分別是:
 Connection getConnection(String url)
 Connection getConnection(String url, Properties info) 
 Connection getConnection(String url, String userId, String password)
 這三種版本的功能完全相同，只是提供登入資料庫所需之帳密的方式不一樣。

 連線所需資訊如下：
 資料庫url: jdbc:mysql://127.0.0.1:3306/cmsdb?useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true
 使用者代號:root
 使用者密碼:Do!ng123

 你必須檢查專案的驅動程式庫。
 */
public class SetDBConnection {
	
	public void connectDB1() {
		String dbURL = "jdbc:mysql://127.0.0.1:3306/cmsdb?user=root&password=Do!ng123&useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
		try(
			// 下列方法有一個參數
			Connection con = DriverManager.getConnection(dbURL);	
		) {
			System.out.println("第一種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB1()內的連線參數: 含帳號/密碼的dbURL");
			} else {
				System.err.print("第一種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	public void connectDB2() {
		String dbURL = "jdbc:mysql://127.0.0.1:3306/cmsdb?useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
		Properties pr = new Properties();
		pr.setProperty("user", "root");
		pr.setProperty("password", "Do!ng123");
		try(
			// 下列方法應該有兩個參數，請修改它
			Connection con = DriverManager.getConnection(dbURL, pr);
		) {
			System.out.println("第二種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB2()內的連線參數: dbURL與pr");
			} else {
				System.err.print("第二種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	public void connectDB3() {
		String dbURL = "jdbc:mysql://127.0.0.1:3306/cmsdb?useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
		try(
			// 下列方法應該有三個參數，請修改它
			Connection con = DriverManager.getConnection(dbURL, "root", "Do!ng123");
		) {
			System.out.println("第三種連線方式: 成功");
		} catch (SQLException e) {
			if (dbURL.length() == 0) {
				System.out.println("請修改connectDB3()內的連線參數: dbURL, 帳號與密碼");
			} else {
				System.err.print("第三種連線方式發生例外: " + e);
				e.printStackTrace();
			}
			return;
		}
	}

	public static void main(String[] args) {
		SetDBConnection e01 = new SetDBConnection();
		e01.connectDB1();
		e01.connectDB2();
		e01.connectDB3();
	}
}
