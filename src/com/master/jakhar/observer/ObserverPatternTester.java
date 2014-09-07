package com.master.jakhar.observer;

/**
 * This is the tester class which tests Observer Pattern.
 * @author Pankaj Jakhar
 *
 */
public class ObserverPatternTester {

	public static void main(String[] args) {
		ObserverPatternTester observerPatternTester = new ObserverPatternTester();
		observerPatternTester.runTestOne();
		
		observerPatternTester.runTestTwo();
	}

	/**
	 * Test #2 with Observers added to Blog.
	 */
	private void runTestTwo() {
		Blog blog = new Blog();
		
		/**Create New Article.*/
		Article article = new Article();
		article.setAuthor("Pankaj Jakhar");
		article.setContent("Hello Observer world!");
		article.setDate("9/1/2014");
		
		/**Create New Observers.*/
		Subscriber subscriberOne = new Subscriber("A");
		Subscriber subscriberTwo = new Subscriber("B");
		Subscriber subscriberThree = new Subscriber("C");
		
		/**Register observers to Blog.*/
		blog.register(subscriberOne);
		blog.register(subscriberTwo);
		blog.register(subscriberThree);
		
		/**Update this article on the blog.*/
		blog.update(article);
		
	}

	/**
	 * Test #1 with no Observer added to Blog.
	 */
	private void runTestOne() {
		Blog blog = new Blog();
		
		/**Create New Article.*/
		Article article = new Article();
		article.setAuthor("Pankaj Jakhar");
		article.setContent("Hello Observer world!");
		article.setDate("9/1/2014");
		
		/**Update this article on the blog.*/
		blog.update(article);
		
	}

}
