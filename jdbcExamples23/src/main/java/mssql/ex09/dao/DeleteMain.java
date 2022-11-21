package mssql.ex09.dao;

public class DeleteMain {

	public static void main(String args[]) {
		int n = 5;
		BookDao bookDao = new BookDaoImpl();
		try {
			if (bookDao.deleteById(n) > 0) {
				System.out.println("刪除成功一筆紀錄");
			} else {
				System.out.println("無紀錄可刪除");
			}
		} catch (Exception e) {
			System.out.println("刪除時發生異常：" + e.getMessage());
			e.printStackTrace();
		}
	}
}