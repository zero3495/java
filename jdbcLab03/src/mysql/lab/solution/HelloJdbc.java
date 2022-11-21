package mysql.lab.solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// 第一個JDBC程式，本程式可以
// 1. 刪除(DROP) Product表格
// 2. 能夠新建(CREATE) Product表格
// 3. 能夠新增(INSERT INTO)三筆Product紀錄

public class HelloJdbc {
	public static void main(String[] args) {
		
		// 刪除(DROP) Product表格，如果Product表格不存在就不刪除Product表格
		String dropTable = "DROP TABLE IF EXISTS Product;";

		// 能夠新建(CREATE) Product表格
		String createTable = "CREATE TABLE  Product (" 
				+ " PRODUCT_ID 		INT 	NOT  NULL  AUTO_INCREMENT, "
				+ " PRODUCT_NAME	VARCHAR(40), " 
				+ " PRICE		 	DECIMAL(9, 1), " 
				+ " QUANTITY   		INT, "
				+ " PRODUCT_DATE	DateTime, " 
				+ " IMAGE			LONGBLOB, " 
				+ " REMARK			LONGTEXT, "
				+ " PRIMARY KEY(PRODUCT_ID)" 
				+ " ) ENGINE=INNODB;";

		// 能夠新增(INSERT INTO)三筆Product紀錄 :
		String insert = "INSERT INTO Product (PRODUCT_NAME, PRICE, QUANTITY, PRODUCT_DATE)" 
				+ " VALUES"
				+ " ( '氣墊運動鞋', 3500.0, 18, '2015-10-25 17:21:40'), "
				+ " ( '登山杖', 1700.0, 25, '2016-3-17 10:16:23'),"
				+ " ( '登山背包', 2500.0, 10, '2017-1-20 13:45:30');";

		String url = "jdbc:mysql://localhost:3306/cmsdb" 
		           + "?useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
		int n = -1;
		try (
			// 建立Java程式與資料庫的連線
			Connection con = DriverManager.getConnection(url, "root", "Do!ng123");
			// 由Connection物件來取得三個java.sql.PreparedStatement物件
			PreparedStatement stmt1 = con.prepareStatement(dropTable);
			PreparedStatement stmt2 = con.prepareStatement(createTable);
			PreparedStatement stmt3 = con.prepareStatement(insert);
		) {
			// 執行該PreparedStatement物件的 executeUpdate()方法來刪除表格
			n = stmt1.executeUpdate();
			if (n==0)
			System.out.println("刪除表格Product成功, n=" + n);

			// 執行該PreparedStatement物件的 executeUpdate()方法來新建表格
			n = stmt2.executeUpdate();
			if (n==0)
			System.out.println("新建表格Product成功, n=" + n);

			// 執行該PreparedStatement物件的 executeUpdate()方法來新建表格
			n = stmt3.executeUpdate();
			if (n < 0){
		    	System.out.println("尚未修改程式");
		    } else {
		    	System.out.println("新增表格Product的紀錄成功, n=" + n);
		    }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
