package com.master.jakhar.observer;

/**
 * Interface for registering, un-registering and notify
 * {@link Observer}s to a {@link Subject}.
 * Any concrete class implementing this interface will be a {@link Subject}.
 * @author Pankaj Jakhar
 *
 */
public interface Subject {
	
	/**Register an {@link Observer}*/
	public void register(Observer observer);
	
	/**Un-register an {@link Observer}*/
	public void unregister(Observer observer);
	
	/**Update an {@link Observer}*/
	public void update(Article article);
}
