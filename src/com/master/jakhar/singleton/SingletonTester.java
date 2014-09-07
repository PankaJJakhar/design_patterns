package com.master.jakhar.singleton;

public class SingletonTester {

	public static void main(String[] args) {
		Thread threadOne = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton singleton = Singleton.getInstance();
				if(singleton.isAlreadyCreatedInstance())
				{
					System.out.println("Instance was already created!");
				}
				else
				{
					System.out.println("New Instance was created!");
				}
			}
		});

		Thread threadTwo = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton singleton = Singleton.getInstance();
				if(singleton.isAlreadyCreatedInstance())
				{
					System.out.println("Instance was already created!");
				}
				else
				{
					System.out.println("New Instance was created!");
				}
			}
		});
		threadOne.start();

		threadTwo.start();
	}
}
