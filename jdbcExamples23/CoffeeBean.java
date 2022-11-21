package mysql._00_util.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CoffeeBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String coffeeName;
	private Integer coffeeCode;
	private Integer supplierId;
	private Double price;
	private Integer sales;
	private Integer total;
	private String createDate;

	public CoffeeBean() {
	}

	public CoffeeBean(Integer coffeeCode, String coffeeName, Integer supplierId,
			Double price, Integer sales, Integer total, String createDate) {
		super();
		this.coffeeCode = coffeeCode;
		this.coffeeName = coffeeName;
		this.supplierId = supplierId;
		this.price = price;
		this.sales = sales;
		this.total = total;
		this.createDate = createDate;
	}

	public CoffeeBean(Integer coffeeCode, String coffeeName, Integer supplierId,
			Double price, Integer sales, Integer total, Date createDate) {
		this.coffeeCode = coffeeCode;
		this.coffeeName = coffeeName;
		this.supplierId = supplierId;
		this.price = price;
		this.sales = sales;
		this.total = total;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.createDate = sdf.format(createDate);
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String n) {
		coffeeName = n;
	}

	public Integer getCoffeeCode() {
		return coffeeCode;
	}

	public void setCoffeeCode(Integer cc) {
		coffeeCode = cc;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer sid) {
		supplierId = sid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double p) {
		price = p;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sa) {
		sales = sa;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer t) {
		total = t;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}	
}
