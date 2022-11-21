package mysql.ex09.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mysql.ex00.SystemConstant;
import mysql.ex03.insert._00.BookBean;

public class BookDaoImpl implements BookDao {
	
	String insertBookString = "INSERT INTO Book_JDBC " 
			+ "(title, author, price, coverImage, discount, fileName, stock) "
			+ " VALUES " + "(?, ?, ?, ?, ?, ?, ?) ";
	
	String deleteBookByIdString = "DELETE FROM Book_JDBC WHERE  bookId  =  ?";
	
	String updateBookString = "UPDATE Book_JDBC SET title = ?, author = ?, price = ?, "
			+ " coverImage = ?, discount = ?, fileName = ?, stock = ?  "
			+ " WHERE bookId  =  ?";
	
	String queryById = "SELECT * FROM Book_JDBC b WHERE b.bookId = ?";

	String queryAll = "SELECT * FROM Book_JDBC b";
	
	@Override
	public void save(BookBean bookBean) throws SQLException {
		try (
				Connection conn = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(), 
						SystemConstant.getPassword());				
				PreparedStatement stmt = conn.prepareStatement(insertBookString);
			) {
				stmt.setString(1, bookBean.getTitle());
				stmt.setString(2, bookBean.getAuthor());
				stmt.setDouble(3, bookBean.getPrice());
				stmt.setBlob(4, bookBean.getCoverImage());
				stmt.setDouble(5, bookBean.getPrice());
				stmt.setString(6, bookBean.getFileName());
				stmt.setInt(7, bookBean.getStock());
				stmt.executeUpdate();
			} 
	}
	@Override
	public int deleteById(Integer id) throws SQLException {
		int n = 0;
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(deleteBookByIdString);
		) {
			stmt.setInt(1, id);
			n = stmt.executeUpdate();
		} 
		return n;
	}
	
	@Override
	public int update(BookBean bookBean) throws SQLException {
		int n = 0;
		try (
			Connection conn = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(updateBookString);
		) {
			stmt.setString(1, bookBean.getTitle());
			stmt.setString(2, bookBean.getAuthor());
			stmt.setDouble(3, bookBean.getPrice());
			stmt.setBlob(4, bookBean.getCoverImage());
			stmt.setDouble(5, bookBean.getDiscount());
			stmt.setString(6, bookBean.getFileName());
			stmt.setInt(7, bookBean.getStock());
			stmt.setInt(8, bookBean.getBookId());
			n = stmt.executeUpdate();
		} 
		return n;
	}
	
	@Override
	public BookBean findById(Integer id) throws SQLException {
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
		} 
		return bookBean;
	}
	
	@Override
	public List<BookBean> findAll() throws SQLException {
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
				
			} 
		return bookBeans;
	}
}
