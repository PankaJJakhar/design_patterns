package com.master.jakhar.observer;

/**
 * Implements Observer interface. This {@link Subscriber} works as an Observer.
 * 
 * @author Pankaj Jakhar
 *
 */
public class Subscriber implements Observer {
	
	private String name;
	
	/**
	 * Parameterized constructor.
	 * @param name
	 */
	public Subscriber(String name) {
		this.setName(name);
	}
	
	@Override
	public void notifyUpdates(Article article) {
		
		System.out.println("Subscriber " + name + " received article update");
		System.out.println("Author: " + article.getAuthor());
		System.out.println("Content: " + article.getContent());
		System.out.println("Date: " + article.getDate());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
