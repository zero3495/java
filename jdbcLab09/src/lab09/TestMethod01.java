package lab09;

import java.io.File;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mssql.ex00.SystemConstant;
import mssql.ex00.model.ProductBean;

public class TestMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Product WHERE PRODUCT_ID = ?";	
			try(
					 Connection con = DriverManager.getConnection(
								SystemConstant.getDbURL(),
								SystemConstant.getUser(),
								SystemConstant.getPassword());
						PreparedStatement stmt = con.prepareStatement(sql);
			) {
				stmt.setInt(1, 1004);//第2個參數是KEY的值，不是第幾個KEY。
				try (
						ResultSet rs = stmt.executeQuery();
				){
					if(rs.next()) {
						ProductBean bean = new ProductBean(
								rs.getInt("product_Id"),
				 				rs.getString("product_Name"),
				 				rs.getDouble("price"),
				 				rs.getInt("quantity"),
				 				rs.getBlob("image"),
				 				rs.getClob("remark"),
				 				rs.getTimestamp("product_Date"),
				 				rs.getString("fileName")
							);
						Blob blob = bean.getImage();
						String filename = bean.getFileName();
						File fileBlob = new File("C:\\data", filename);
						SystemUtils.blobToFile(blob, fileBlob);
						Clob clob = bean.getRemark();
						filename = "remark_" + bean.getProductId() + ".txt";
						File fileClob = new File("C:\\data", filename);
						SystemUtils.clobToFile(clob, fileClob);
					}
					System.out.println("OK.");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		
			
		
	}

}
