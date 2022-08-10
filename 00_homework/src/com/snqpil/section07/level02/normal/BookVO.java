package com.snqpil.section07.level02.normal;

public class BookVO {
	
	private String title; 
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public BookVO() {} //기본생성자 생성
	public BookVO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	} // 필드 3가지를 초기화하는 생성자
	public BookVO(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	} // 모든 필드를 초기화 하는 생성자
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printInformation() {
		
		System.out.println(this.title+", "+this.publisher+", "+this.author+", "+this.price+", "+this.discountRate);
	}
	
	
}
