package mssql.ex10.transaction._02_model;

public class OrderItemDAOBean {
	int seqno;
	int orderNo;
	int bookID;
	String description;
	int amount;
	double unitPrice;
	double discount;

	public OrderItemDAOBean(int seqno, int orderNo, int bookID,
			String description, int amount, double unitPrice, double discount) {
		super();
		this.seqno = seqno;
		this.orderNo = orderNo;
		this.bookID = bookID;
		this.description = description;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.discount = discount;
	}

	public OrderItemDAOBean() {
		
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}