package mssql.ex03.insert._04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mssql.ex00.SystemConstant;
import mssql.ex00.SystemUtils;

public class BatchInsertAdvance {
	static String insertBookString = "";
	static String dataFilename = "data/batchInsert/BookBatchInsert.txt";

	public static void main(String[] args) {
		setSQLCOmmand();
		batchInsert();
	}

	private static void batchInsert() {
		try (Connection conn = DriverManager.getConnection(
				SystemConstant.getDbURL(), 
				SystemConstant.getUser(),
				SystemConstant.getPassword()); 
			PreparedStatement stmt = conn.prepareStatement(insertBookString);
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								new FileInputStream(dataFilename)));	
		) {
			
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] sa = line.split("\\|");
				// tilie 書名
				stmt.setString(1, sa[0]);
				// author 作者
				stmt.setString(2, sa[1]);
				// price 價格
				Double price = 0.0;
				try {
					price = Double.parseDouble(sa[2]);
				} catch (NumberFormatException e) {
					;
				}
				stmt.setDouble(3, price);
				// coverImage 封面
				Blob blob = SystemUtils.fileToBlob(sa[3]);
				stmt.setBlob(4, blob);
				// discount 折扣
				Double discount = 0.0;
				try {
					discount = Double.parseDouble(sa[4]);
				} catch (NumberFormatException e) {
					;
				}
				stmt.setDouble(5, discount);
				// filename 封面圖檔的檔名
				stmt.setString(6, SystemUtils.extractFilename(sa[3]));
				// stock 庫存
				Integer stock = 0;
				try {
					stock = Integer.parseInt(sa[5]);
				} catch (NumberFormatException e) {
					;
				}
				stmt.setInt(7, stock);
				stmt.executeUpdate();
				System.out.println("新增一筆Book_JDBC紀錄成功");
			}
		} catch (SQLException e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.print("IO時發生例外: " + e);
			e.printStackTrace();
		}
	}

	private static void setSQLCOmmand() {
		// 新增一筆Book_JDBC之紀錄
		insertBookString = "INSERT INTO Book_JDBC " + "(title, author, price, coverImage, discount, fileName, stock) "
				+ " VALUES " + "(?, ?, ?, ?, ?, ?, ?) ";
	}
}
