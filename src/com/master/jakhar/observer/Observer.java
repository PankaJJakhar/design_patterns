package com.master.jakhar.observer;

/**
 * Interface for notifying an {@link Observer}.
 * Any concrete class implementing this interface will
 * be an {@link Observer}.
 * @author Pankaj Jakhar
 *
 */
public interface Observer {
	/**Notifies updates to the observer.*/
	public void notifyUpdates(Article article);
}
