package mssql.ex09.dao;

import java.util.List;

import mssql.ex03.insert._00.BookBean;

public class FindAllMain {

	public static void main(String args[]) {
		try {
			BookDao bookDao = new BookDaoImpl();
			List<BookBean> bookBeans = bookDao.findAll();
			if (! bookBeans.isEmpty() ) {
				for(BookBean bean :bookBeans) {
					System.out.println(bean);
				}
				System.out.println("查詢成功");
			} else {
				System.out.println("查無紀錄");
			}
		} catch (Exception e) {
			System.out.println("新增時發生異常：" + e.getMessage());
			e.printStackTrace();
		}
	}
}