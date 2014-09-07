package com.master.jakhar.FactoryMethod;

/**
 * 
 * @author Class that tests the FactoryMethod and Factory Pattern.
 *
 */
public class FactoryMethodTester {

	public static void main(String[] args) {
		testOne();
		
		testTwo();
	}

	private static void testTwo() {
		
		/**
		 * Get Red color.
		 */
		Color red = ColorFactory.getInstance().getColor(ColorType.RED);
		red.drawColor();
		
		/**
		 * Get Green color.
		 */
		Color green = ColorFactory.getInstance().getColor(ColorType.GREEN);
		green.drawColor();
		
	}

	private static void testOne() {
		/**
		 * Get instance of colorFactory.
		 */
		ColorFactory colorFactory = ColorFactory.getInstance();
		
		/**
		 * Get Red color.
		 */
		Color red = colorFactory.getColor(ColorType.RED);
		red.drawColor();
		
		/**
		 * Get Green color.
		 */
		Color green = colorFactory.getColor(ColorType.GREEN);
		green.drawColor();
		
	}

}
