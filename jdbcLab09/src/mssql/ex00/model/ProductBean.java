package mssql.ex00.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;

public class ProductBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	Integer		productId;
	String		productName;
	Double		price;
	Integer		quantity;
	Blob		image;
	Clob		remark;
	Timestamp	productDate;
	String  	fileName;
	
	public ProductBean(Integer productId, String productName, Double price, 
			Integer quantity, Blob image, Clob remark,
			Timestamp productDate, String fileName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.remark = remark;
		this.productDate = productDate;
		this.fileName = fileName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public Clob getRemark() {
		return remark;
	}

	public void setRemark(Clob remark) {
		this.remark = remark;
	}

	public Timestamp getProductDate() {
		return productDate;
	}

	public void setProductDate(Timestamp productDate) {
		this.productDate = productDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ProductBean() {
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", image=" + image + ", remark=" + remark + ", productDate=" + productDate
				+ ", fileName=" + fileName + "]";
	}
	
}
