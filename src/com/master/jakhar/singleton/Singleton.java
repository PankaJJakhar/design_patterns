package com.master.jakhar.singleton;

public class Singleton {

	/**
	 * Keep it static so that static factory method can access it.
	 */
	private static Singleton mSingleton = null;
	private boolean mAlreadyCreatedInstance = false;
	
	private Singleton() {

	}

	/**
	 * Makes sure that it is synchronized and only one instance of class is
	 * created.
	 * This method is a Global point of access to the instance of {@link Singleton} class.
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		if (mSingleton == null) {
			mSingleton = new Singleton();
			System.out.println("Created new Singleton instance");
			mSingleton.setAlreadyCreatedInstance(false);			
		}
		mSingleton.setAlreadyCreatedInstance(true);
		return mSingleton;
	}

	public boolean isAlreadyCreatedInstance() {
		return mAlreadyCreatedInstance;
	}

	public void setAlreadyCreatedInstance(boolean mAlreadyCreatedInstance) {
		this.mAlreadyCreatedInstance = mAlreadyCreatedInstance;
	}

}
