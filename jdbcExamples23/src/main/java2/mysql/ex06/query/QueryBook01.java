package mysql.ex06.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mysql.ex00.SystemConstant;
import mysql.ex03.insert._00.BookBean;

public class QueryBook01 {
	static String queryById = "";

	public static void main(String args[]) {
		setSQLCOmmand();
		int id = 5;
		BookBean bookBean = findById(id);
		diaplayResult(bookBean);
	}

	private static void diaplayResult(BookBean book) {
		System.out.println(book);
	}

	private static BookBean findById(Integer id) {
		BookBean bookBean = null;
		try (
			Connection conn = DriverManager.getConnection(
									SystemConstant.getDbURL(), 
									SystemConstant.getUser(),
									SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(queryById);
		) {
			stmt.setInt(1, id);
			try (ResultSet resultSet = stmt.executeQuery();) {
				if (resultSet.next()) {
					bookBean = new BookBean(
							resultSet.getInt("bookId"), 
							resultSet.getString("title"),
							resultSet.getString("author"), 
							resultSet.getDouble("price"),
							resultSet.getBlob("coverImage"), 
							resultSet.getDouble("discount"),
							resultSet.getString("fileName"), 
							resultSet.getInt("stock")
					);
				}
			}
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		}
		return bookBean;
	}

	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		queryById = "SELECT * FROM Book_JDBC b WHERE b.bookId = ?";
	}
}