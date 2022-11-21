package mssql.ex11.storeProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import mssql.ex00.SystemConstant;

public class InvokeStoredProcedure02 {
	public static void main(String args[]) {

		try(
				Connection con = DriverManager.getConnection(
						SystemConstant.getDbURL(), 
						SystemConstant.getUser(), 
						SystemConstant.getPassword());
	
			CallableStatement cs1 = con.prepareCall("{ call spInOut(?, ?, ?) }");
		) {
			System.out.println("呼叫預儲程序spInOut()");
			cs1.registerOutParameter(1, Types.INTEGER); 	
			cs1.registerOutParameter(2, Types.DOUBLE); 	
			cs1.setInt(3, 35); 		
			cs1.execute();
			System.out.println(cs1.getInt(1));
			System.out.println(cs1.getDouble(2));
			System.out.println("預儲程序spInOut()執行完畢");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
