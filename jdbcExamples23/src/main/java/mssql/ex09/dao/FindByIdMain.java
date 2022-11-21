package mssql.ex09.dao;

import mssql.ex03.insert._00.BookBean;

public class FindByIdMain {

	public static void main(String args[]) {
		int id = 10;
		try {
			BookDao bookDao = new BookDaoImpl();
			BookBean bookBean = bookDao.findById(id);
			if (bookBean != null) {
				System.out.println(bookBean);
				System.out.println("查詢成功");
			} else {
				System.out.println("查無此筆紀錄，id=" + id);
			}
		} catch (Exception e) {
			System.out.println("新增時發生異常：" + e.getMessage());
			e.printStackTrace();
		}
	}
}