package com.master.jakhar.FactoryMethod;

public class  ColorFactory {

	/**
	 * Static instance of {@link ColorFactory} so that it can be accessed using
	 * Static Factory method.
	 */
	private static ColorFactory mColorFactory = null;

	private Red mRed = null;
	private Green mGreen = null;

	/**
	 * Allows only one instance creation of ColorFactory. Thread safe.
	 * 
	 * @return
	 */
	public static synchronized ColorFactory getInstance() {
		if (mColorFactory == null) {
			mColorFactory = new ColorFactory();
		}
		return mColorFactory;
	}

	/**
	 * Make it private so that its instantiation will be controlled.
	 */
	private ColorFactory()
	{
		
	}
	
	/**
	 * Create the instance of required class and returns it to the client called
	 * it.
	 * 
	 * @param colorName
	 * @return
	 */
	public Color getColor(ColorType colorType) {
		Color color = null;
		
		if (colorType == ColorType.RED) {
			color = getRedColor();
		} else if (colorType == ColorType.GREEN) {
			color = getGreenColor();
		}
		return color;
	}

	/**
	 * Singleton implementation for {@link Green} color.
	 * 
	 * @return
	 */
	private Color getGreenColor() {
		if (mGreen == null) {
			mGreen = new Green();
		}
		return mGreen;
	}

	/**
	 * Singleton implementation for {@link Red} color.
	 * 
	 * @return
	 */
	private Color getRedColor() {
		if (mRed == null) {
			mRed = new Red();
		}
		return mRed;
	}

}
