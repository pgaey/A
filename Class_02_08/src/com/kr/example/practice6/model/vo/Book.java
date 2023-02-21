package com.kr.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	public Book() {
		
	}
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	
	public void inform() {
		System.out.println("책 이름 : " + title +
				" 출판사 : " + publisher +
				" 저자 : " + author +
				" 가격 : " + price +
				" 할인 : " + discountRate + "%");
	}
	

}
