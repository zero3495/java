package mssql.ex10.transaction._02_model;

import java.util.Collection;

public interface OrderDao {

	void insertOrder(OrderBean ob) throws Exception;

	OrderBean getOrder(int orderNo) throws Exception;

	Collection<OrderBean> getAllOrders() throws Exception;

}