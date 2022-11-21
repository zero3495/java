package mysql.ex10.transaction._02_model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mysql.ex00.SystemConstant;

// 本類別
//   1.新增一筆訂單到orders表格
//   2.查詢orders表格內的單筆訂單
//   3.查詢orders表格內的所有訂單

public class OrderDaoImpl implements OrderDao {
	
//	private String memberId = null;
	
	public OrderDaoImpl() {
	}

	@Override
	public void insertOrder(OrderBean ob) throws SQLException {
		String sqlOrder = "Insert Into orders "
				+ " (userID, totalAmount, shippingAddress, BNO, InvoiceTitle, orderDate) "
				+ " values(?, ?, ?, ?, ?, ?) ";
		String sqlItem = "Insert Into OrderItems (orderNo, bookID, description, amount, unitPrice, discount) "
				+ " values(?, ?, ?, ?, ?, ?) ";		
		
		ResultSet generatedKeys = null;
		try(
			Connection con = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(),
						SystemConstant.getPassword()); 
		)
		{
     		con.setAutoCommit(false);  // 開啟JDBC Transaction
			try (
				PreparedStatement pStmt = con.prepareStatement(sqlOrder,
												Statement.RETURN_GENERATED_KEYS);
				PreparedStatement pStmt2  = con.prepareStatement(sqlItem);
			) {
			
	     		pStmt.setString(1, ob.getUserId());
		     	pStmt.setDouble(2, ob.getTotalAmount());
			    pStmt.setString(3, ob.getShippingAddress());
			    pStmt.setString(4, ob.getBno());
			    pStmt.setString(5, ob.getInvoiceTitle());
			    Timestamp ts = new Timestamp(ob.getOrderDate().getTime());
			    pStmt.setTimestamp(6, ts);
			    pStmt.executeUpdate();
			    int id = 0;
			    generatedKeys = pStmt.getGeneratedKeys();
			    if (generatedKeys.next()) {
				   id = generatedKeys.getInt(1);
			    } else {
				   throw new SQLException(
					"Creating user failed, no generated key obtained.");
			    }
			    List<OrderItemDAOBean> items = ob.getItems();
			
     			int n=0;
	    		for (OrderItemDAOBean oib : items) {
//               下列四個敘述為交易測試而編寫	
  				    n++;
	    			if (n > 2) {
		    			System.out.println("發生例外 n>2");
			    		throw new SQLException("JDBC交易測試用");
				    }
				    pStmt2.setInt(1, id);
				    pStmt2.setInt(2, oib.getBookID());
				    pStmt2.setString(3, oib.getDescription());
				    pStmt2.setDouble(4, oib.getAmount());
				    pStmt2.setDouble(5, oib.getUnitPrice());
				    pStmt2.setDouble(6, oib.getDiscount());
				    pStmt2.executeUpdate();
				    pStmt2.clearParameters();
			    }
			    con.commit();  
		     } catch(SQLException ex){
			    System.out.println("資料還原...");
			    if (con != null) con.rollback();
			    throw new RuntimeException(ex.getMessage());
		     } finally {
		    	 con.setAutoCommit(true);
		     }
		} 
	}

	@Override
	public OrderBean getOrder(int orderNo) throws Exception {
		String sqlOrder = "SELECT * FROM orders WHERE orderNo = ? ";
		String sqlOrderItems = "SELECT * FROM orderItems WHERE orderNo = ? order by seqNo";
		List<OrderItemDAOBean> items = new ArrayList<OrderItemDAOBean>();
		ResultSet rs2 = null;
		OrderBean ob = null;
		try (
			Connection con = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(),
						SystemConstant.getPassword()); 
			PreparedStatement pStmt = con.prepareStatement(sqlOrder);
		) {
			pStmt.setInt(1, orderNo);
			try (
				ResultSet rs = pStmt.executeQuery();
			) 
			{
				if (rs.next()) {
					ob = new OrderBean();
					ob.setOrderNo(rs.getInt(1));
					ob.setUserId(rs.getString(2));
					ob.setTotalAmount(rs.getDouble(3));
					ob.setShippingAddress(rs.getString(4));
					ob.setBno(rs.getString(5));
					ob.setInvoiceTitle(rs.getString(6));
					ob.setOrderDate(rs.getDate(7));
					ob.setShippingDate(rs.getDate(8));
				}
				if (ob == null) {
					throw new SQLException("資料庫邏輯錯誤：無此紀錄, 訂單編號=" + orderNo);
				} else {
					try (
						PreparedStatement pStmt2 = 
						   con.prepareStatement(sqlOrderItems);
					) 
					{
						pStmt2.setInt(1, orderNo);
						rs2 = pStmt2.executeQuery();
						OrderItemDAOBean oib = null;
						while (rs2.next()) {
							oib = new OrderItemDAOBean();
							oib.setSeqno(rs2.getInt(1));
							oib.setOrderNo(rs2.getInt(2));
							oib.setBookID(rs2.getInt(3));
							oib.setDescription(rs2.getString(4));
							oib.setAmount(rs2.getInt(5));
							oib.setUnitPrice(rs2.getDouble(6));
							oib.setDiscount(rs2.getDouble(7));
							items.add(oib);
						}
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
			}
			ob.setItems(items);
		}
		return ob;
	}

	@Override
	public Collection<OrderBean> getAllOrders() throws SQLException {
		Collection<OrderBean> coll = new ArrayList<OrderBean>();
		String sqlOrder = "SELECT * FROM orders Order by orderDate desc, orderNo desc ";
		OrderBean ob = null;
		try(
			Connection con = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(),
						SystemConstant.getPassword()); 
			PreparedStatement pStmt = con.prepareStatement(sqlOrder);
			ResultSet rs = pStmt.executeQuery();
		) {
			while (rs.next()) {
				ob = new OrderBean();
				ob.setOrderNo(rs.getInt(1));
				ob.setUserId(rs.getString(2));
				ob.setTotalAmount(rs.getDouble(3));
				ob.setShippingAddress(rs.getString(4));
				ob.setBno(rs.getString(5));
				ob.setInvoiceTitle(rs.getString(6));
				ob.setOrderDate(rs.getDate(7));
				ob.setShippingDate(rs.getDate(8));
				coll.add(ob);
			}
		} 
		return coll;
	}
	
}