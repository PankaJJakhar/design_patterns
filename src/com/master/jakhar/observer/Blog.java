package com.master.jakhar.observer;

import java.util.ArrayList;

/**
 * Blog class keeps all the registered Observers and notifies them whenever an
 * update is available.
 * 
 * @author Pankaj Jakhar
 *
 */
public class Blog implements Subject {

	private ArrayList<Observer> mObserverList = null;

	/**
	 * Parameter less constructor which needs to be called to create an instance
	 * of {@link Blog}.
	 */
	public Blog() {
		/** Initialize mObserverList here. */
		mObserverList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		/**Adds new Observer to mOserverList.*/
		mObserverList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		/**Removes Observer from mOserverList.*/
		mObserverList.remove(observer);

	}

	@Override
	public void update(Article article) {
		
		if(mObserverList.size() == 0)
		{
			System.out.println("No observer to send broadcast to.");
			return;
		}
		
		for(Observer observer: mObserverList)
		{
			System.out.println("Broadcast sent...");
			observer.notifyUpdates(article);
		}

	}

}
