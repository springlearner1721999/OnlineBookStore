package com.example.OnlineBookStore.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String skc;
	private String name;
	private String discription;
	
	@ManyToOne
	@JoinColumn(name = "book_type_id",nullable = false)
	public BookType bookType;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "unit_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	private Date createOn;
	
	@Column(name = "last_updated")
	private Date updateOn;
	
	private Boolean active;
	
	
	public Book() {
		
	}
	public Book(Book book) {
		
		this.id = book.id;
		this.skc = book.skc;
		this.name = book.name;
		this.discription = book.discription;
		this.unitPrice = book.unitPrice;
		this.imageUrl = book.imageUrl;
		this.unitsInStock = book.unitsInStock;
		this.createOn = book.createOn;
		this.updateOn = book.updateOn;
		this.active = book.active;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkc() {
		return skc;
	}
	public void setSkc(String skc) {
		this.skc = skc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	public Date getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", skc=" + skc + ", name=" + name + ", discription=" + discription + ", bookType="
				+ bookType + ", unitPrice=" + unitPrice + ", imageUrl=" + imageUrl + ", unitsInStock=" + unitsInStock
				+ ", createOn=" + createOn + ", updateOn=" + updateOn + ", active=" + active + "]";
	}
	
	
}
