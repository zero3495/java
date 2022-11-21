package mssql.ex03.insert._00;

import java.io.Serializable;
import java.sql.Blob;

@SuppressWarnings("serial")
public class BookBean implements Serializable{
	Integer bookId;
	String 	title;
	String 	author;
	Double	price;
	Blob 	coverImage;
	Double 	discount;
	String 	fileName;
	Integer stock;
	
	public BookBean() {
	}

	public Integer getBookId() {
		return bookId;
	}

	public BookBean(Integer bookId, String title, String author, Double price, 
			Blob coverImage, Double discount,
			String fileName, Integer stock) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.coverImage = coverImage;
		this.discount = discount;
		this.fileName = fileName;
		this.stock = stock;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Blob getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(Blob coverImage) {
		this.coverImage = coverImage;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "BookBean [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", discount=" + discount + ", fileName=" + fileName + ", stock=" + stock + "]";
	}
	
	
}
