package com.ajax.bean;

import java.util.ArrayList;

public class Book {
	private String name;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public ArrayList<Book> getBookList(){
		ArrayList<Book> bookList=new ArrayList<>();
		for(int i=0;i<10;i++){
			Book book=new Book();
			book.setName("速度与激情"+i);
			book.setAuthor("四体分");
			bookList.add(book);
		}
		return bookList;
	}
}
