package mysql.ex10.transaction._01_controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import mysql.ex10.transaction._02_model.OrderBean;
import mysql.ex10.transaction._02_model.OrderDao;
import mysql.ex10.transaction._02_model.OrderDaoImpl;
import mysql.ex10.transaction._02_model.OrderItemDAOBean;

public class InsertOrderMain {

	public static void main(String args[]) throws Exception{
		OrderItemDAOBean  oiBean1 = new OrderItemDAOBean(0, 11, 1001, "快樂學JDBC 張君雅 碁峰(Error)", 1, 480, 0.8); 
		OrderItemDAOBean  oiBean2 = new OrderItemDAOBean(0, 11, 1005, "JDBC 入門   劉麗芳 松崗(Error)", 2, 420, 1.0);
		OrderItemDAOBean  oiBean3 = new OrderItemDAOBean(0, 11, 1020, "PHP進階   王玉佩 學貫(Error)", 5, 400, 0.9);
		OrderItemDAOBean  oiBean4 = new OrderItemDAOBean(0, 11, 1015, "Java進階與實務  黃偉明 學貫(Error)", 2, 500, 0.9);
		
		List<OrderItemDAOBean> items = Arrays.asList(oiBean1, oiBean2, oiBean3, oiBean4);
		
		OrderBean  ob = new OrderBean( "B115", 1650.0, "台中市五權西三街一號", 
				"86591006", "華中科技有限公司", new Date(), 
				new Date(),  items);
		OrderDao   dao = new OrderDaoImpl ();    
		try {
			dao.insertOrder(ob);
			System.out.println("訂單新增成功");
		} catch(RuntimeException e) {
			System.out.println("訂單新增失敗: " + e.getMessage());
		}
	}
}
