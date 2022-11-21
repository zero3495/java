package mysql.ex10.transaction._00_init;

/*  
    程式說明：建立表格與設定初始測試資料。
    表格包括：Orders, OrderItems
          
(1) Orders欄位說明:
    orderNo        : 訂單編號PrimaryKey 整數      IDENTITY
    userId         : 客戶編號           字串      20
    totalAmount    : 總金額             numeric(10,1)
    shippingAddress: 出貨地址           字串      64    
    BNO            : 統一編號           字串       8
    invoiceTitle   : 發票抬頭           字串      72
    orderDate      : 訂單日期           datetime 
    ShippingDate   : 出貨日期           datetime
    CancelTag      : 取消               字串       1
    
(2) OrderItems欄位說明:
    seqNo        : PrimaryKey            整數      IDENTITY
    orderNo      : 訂單編號              整數
    bookID       : 書籍代號              整數
    Description  : 說明                  字串      72
    amount       : 數量                  int
    unitPrice    : 單價                  numeric(10,1)
    Discount     : 折扣                  numeric(10,1)
 
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class OrderTablesReset {
	private static String dropTableOrdersString;
	private static String createTableOrdersString;

	private static String dropTableOrderItemsString;
	private static String createTableOrderItemsString;

	public static void main(String args[]) {
		setSQLCOmmand();
		try (Connection conn = DriverManager.getConnection(
									SystemConstant.getDbURL(), 
									SystemConstant.getUser(),
									SystemConstant.getPassword());
				PreparedStatement stmt1 = conn.prepareStatement(dropTableOrdersString);
				PreparedStatement stmt2 = conn.prepareStatement(createTableOrdersString);
				PreparedStatement stmt3 = conn.prepareStatement(dropTableOrderItemsString);
				PreparedStatement stmt4 = conn.prepareStatement(createTableOrderItemsString);
		) {
			// 執行刪除Orders表格的SQL命令
			stmt1.executeUpdate();
			System.out.println("Orders表格刪除成功");
			// 執行新建Orders表格的SQL命令
			stmt2.executeUpdate();
			// 印出執行成功的訊息
			System.out.println("Orders表格產生成功");
			// 執行刪除OrderItems表格的SQL命令
			stmt3.executeUpdate();
			// 印出執行成功的訊息
			System.out.println("OrderItems表格刪除成功");
			// 執行新建OrderItems表格的SQL命令
			stmt4.executeUpdate();
			// 印出執行成功的訊息
			System.out.println("OrderItems表格產生成功");
		} catch (SQLException e) {
			System.err.println("新建Orders表格時發生SQL例外: " + e.getMessage());
		}

	}

	private static void setSQLCOmmand() {
		// 定義刪除Orders表格的SQL命令
		dropTableOrdersString = "DROP TABLE IF EXISTS  Orders; ";
		// 定義新建Orders表格的SQL命令
		createTableOrdersString = " Create Table Orders " 
				+ " (orderNo          int NOT NULL AUTO_INCREMENT Primary Key, "
				+ " userId            varchar(20), " 
				+ " totalAmount       NUMERIC(11,2), "
				+ " shippingAddress   varchar(64), " 
				+ " BNO               varchar(8), "
				+ " invoiceTitle      varchar(72), " 
				+ " orderDate         DateTime, " 
				+ " ShippingDate      DateTime, "
				+ " CancelTag         Char(1) " 
				+ " ) ";
		// 定義刪除OrderItems表格的SQL命令
		dropTableOrderItemsString = " DROP TABLE IF EXISTS  OrderItems; ";
		// 定義新建OrderItems表格的SQL命令
		createTableOrderItemsString = "Create Table OrderItems "
				+ "(seqno            int NOT NULL AUTO_INCREMENT Primary Key, " 
				+ " orderNo          int, "
				+ " bookID           int, " 
				+ " Description      varchar(72), " 
				+ " amount           int, "
				+ " unitPrice        NUMERIC(11,2), " 
				+ " Discount         NUMERIC(11,2) " 
				+ " ) ";
	}
}