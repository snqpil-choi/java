package com.uni.section1.object.book;

public class Book {

	private int number;
	private String title;
	private String author;
	private int price;

	
	public Book() {
		super();
	}
	

	public Book(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [number=" + this.number 
	               + ", title=" + title 
	               + ", author=" + author 
	               + ", price=" + price
	               + "]";
	}


	@Override
	public boolean equals(Object obj) {
				
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		Book other = (Book) obj;
		
		if(this.number != other.number) {
			return false;
		}
		
		if(this.title == null) { // 책 제목이 null이고
			
			if(other.title != null) { // 다른 책 제목은 null이 아니면 다르므로 false
				return false;
			}
		} else if (!this.title.equals(other.title)) { // 다른 책 제목과 다르면 false
			return false;
		}
		
		if(this.author == null) {
			
			if(other.author != null) {
				return false;
			}
		} else if (!this.author.equals(other.author)) {
			return false;
		}
		
		if(this.price != other.price) {
			return false;
		} 
		
		
		return true;
	}


	@Override
	public int hashCode() {
		
		int result = 1;
		
		/* 필드마다 곱해줄 소수값을 선언
	     * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확율을 증가시킨다.
	     * 31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.
	     * 중복되는 값이 나오지 않게 하기위해 소수를 곱해주는데 값이 너무작으면 중복된값이 발생할수있고 
	     * 값이 너무크면 오버 플로우가 발생할수있기때문에 통상적으로 31 을 곱해준다. */
		
		final int PRIME = 31;
		
		result = PRIME * result + this.number;
		/* String 클래스의 hashCode 메소드는 이미 재정의 되어 있다.
	     * 같은 값을 가지는 문자열은 동일한 hashCode값을 반환한다.
	     * */
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		return result;
	}
	
	
	
}
