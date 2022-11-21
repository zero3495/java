package mysql.ex09.dao;

import java.sql.SQLException;
import java.util.List;

import mysql.ex03.insert._00.BookBean;

public interface BookDao {

	void save(BookBean bookBean) throws SQLException;

	int deleteById(Integer id) throws SQLException;

	int update(BookBean bookBean) throws SQLException;

	BookBean findById(Integer id) throws SQLException;

	List<BookBean> findAll() throws SQLException;

}