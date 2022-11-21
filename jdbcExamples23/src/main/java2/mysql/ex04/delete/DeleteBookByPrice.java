package mysql.ex04.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;

public class DeleteBookByPrice {
	static String deleteBookByPriceString = "";
	public static void main(String args[]) {
		Double price = 400.0;
		setSQLCOmmand();
		int ctr = deleteByPrice(price);
		if (ctr > 0) {
			System.out.println("成功刪除BOOK_JDBC內, 價格大於" + price + "的" + ctr + "筆紀錄");
		} else {
			System.out.println("表格BOOK_JDBC中無紀錄可刪除");				
		} 
	}

	private static int deleteByPrice(Double price) {
		int n = 0;
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(deleteBookByPriceString);
		) {
			stmt.setDouble(1, price);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
		return n;
	}
	private static void setSQLCOmmand() {
		deleteBookByPriceString = "DELETE FROM Book_JDBC WHERE  Price >=  ?";
	}
}