package mysql.ex06.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mysql.ex00.SystemConstant;
import mysql.ex03.insert._00.BookBean;

public class QueryBook02 {
	static String queryAll = "";
	public static void main(String args[]) {
		setSQLCOmmand();
		List<BookBean> allBooks = findAll();
		diaplayResult(allBooks);	
	}
	private static void diaplayResult(List<BookBean> allBooks) {
		for(BookBean bean : allBooks) {
			System.out.println(bean);
		}
		
	}
	private static List<BookBean> findAll() {
		List<BookBean> bookBeans = new ArrayList<>();
		try (
				Connection conn = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(), 
						SystemConstant.getPassword());				
				PreparedStatement stmt = conn.prepareStatement(queryAll);
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
				
			} catch (SQLException e) {
				System.err.print("存取資料庫時發生例外: " + e);
				e.printStackTrace();
			}
		return bookBeans;
	}
	
	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		queryAll = "SELECT * FROM Book_JDBC ";
	}
}