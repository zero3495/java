package mssql.ex06.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mssql.ex00.SystemConstant;
import mssql.ex03.insert._00.BookBean;

public class QueryBook03 {
	static String queryByPrice = "";

	public static void main(String args[]) {
		setSQLCOmmand();
		double mix = 350;
		double max = 500;
		List<BookBean> books = findByPrice(mix, max);
		diaplayResult(books);
	}

	private static void diaplayResult(List<BookBean> books) {
		for(BookBean bean : books) {
			System.out.println(bean);
		}
	}

	private static List<BookBean> findByPrice(double mix, double max) {
		List<BookBean> bookBeans = new ArrayList<>();
		try (
			Connection conn = DriverManager.getConnection(
									SystemConstant.getDbURL(), 
									SystemConstant.getUser(),
									SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(queryByPrice);
		) {
			stmt.setDouble(1, mix);
			stmt.setDouble(2, max);
			try (
				ResultSet resultSet = stmt.executeQuery();
			) {
				while (resultSet.next()) {
					BookBean book = new BookBean(
							resultSet.getInt("bookId"), 
							resultSet.getString("title"), 
							resultSet.getString("author"), 
							resultSet.getDouble("price"), 
							resultSet.getBlob("coverImage"), 
							resultSet.getDouble("discount"), 
							resultSet.getString("fileName"), 
							resultSet.getInt("stock")
							);
					bookBeans.add(book);
				}
			}
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
		return bookBeans;
	}

	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		queryByPrice = "SELECT * FROM Book_JDBC b WHERE b.price BETWEEN ? AND ?";
	}
}