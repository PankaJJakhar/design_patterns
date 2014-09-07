package com.master.jakhar.observer;

/**
 * This is the wrapper which contains all the required fields which are needed
 * for an Article.
 * 
 * @author Pankaj Jakhar
 *
 */
public class Article {

	String content;
	String author;
	String date;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
