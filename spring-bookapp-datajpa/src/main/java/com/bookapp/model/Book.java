package com.bookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//this class is an entity class
//jpa will convert this into a table
@Entity
@Table(name="mybook")
public class Book {

	private String tittle;
	@Id //is a primary key
	@GeneratedValue(generator = "book_gen",strategy = GenerationType.AUTO)//for auto generated key
	@SequenceGenerator(name = "book_gen",sequenceName = "book_sequence",initialValue = 100,allocationSize = 1)
	private Integer bookId;
	private String author;
	private String catagery;
	@Column(name="cost")
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String tittle, String author, String catagery, double price) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.catagery = catagery;
		this.price = price;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCatagery() {
		return catagery;
	}
	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", bookId=" + bookId + ", author=" + author + ", catagery=" + catagery
				+ ", price=" + price + "]";
	}

	
	
	
}
