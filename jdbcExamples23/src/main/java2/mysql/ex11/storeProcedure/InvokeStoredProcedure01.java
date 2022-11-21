package mysql.ex11.storeProcedure;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import mysql.ex00.SystemConstant;
import mysql.ex00.SystemUtils;

public class InvokeStoredProcedure01 {
	public static void main(String args[]) {

		try(
			Connection con = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(), 
						SystemConstant.getPassword());
	
			CallableStatement cs1 = con.prepareCall("{ call spIn(?, ?, ?, ?, ?, ?, ?) }");
		) {
			System.out.println("呼叫預儲程序spIn()");
			// 所有 IN 參數必須透過 CallableStatement.setXXX(n, value) 來設定它的初值
			cs1.setString(1, "米小薯流浪記"); 	// 設定 IN 參數的初值, 1 表示 ? 的編號
			cs1.setString(2, "米小薯"); 		
			cs1.setDouble(3, 240.0); 		
			String path = "data/sp/mickey.jpg";
			Blob blob = SystemUtils.fileToBlob(path);
			String fileName = SystemUtils.extractFilename(path);
			cs1.setBlob(4, blob); 				
			cs1.setString(5, fileName); 		
			cs1.setDouble(6, 0.95); 
			cs1.setInt(7,30); 
			cs1.execute();
			System.out.println("預儲程序spIn()執行完畢");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
