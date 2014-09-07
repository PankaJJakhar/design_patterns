package com.master.jakhar.builder;

/**
 * This is the Builder pattern's implementation.
 * <p>
 * In the brief description of Builder pattern, you just want to use this
 * pattern when you need to create a complex object which needs a lot of
 * parameters to create. You can think of as building something using pieces
 * wher you might not need all the pieces to build. You must have some pieces;
 * you can call them mandatory fields and you might also need some other
 * optional things to create. Those optional things depends on your requirement.
 * You might need them all or one or two or a only few of them.
 * <p>
 * 
 * This implementation takes three mandatory fields:
 * <h1>valueOne, valueTwo and valueThree</h1>
 * This implementation also takes three optional fields:
 * <h1>optionalOne, optionalTwo and optionalThree</h1>
 * 
 * <h2>Other details you will find in the documentation of this class' methods
 * and constructors.</h2>
 * 
 * @author Pankaj Jakhar
 *
 */
public class QuantityBuilder {

	/**
	 * These all are mandatory fields. Keep them private so that only Builder
	 * class will have access to them.
	 */
	private final int valueOne;
	private final int valueTwo;
	private final int valueThree;

	/**
	 * Optional values. Keep them private so that only Builder class will have
	 * access to them.
	 */
	private final int optionalOne;
	private final int optionalTwo;
	private final int optionalThree;

	public int getValueOne() {
		return valueOne;
	}

	public int getValueTwo() {
		return valueTwo;
	}

	public int getValueThree() {
		return valueThree;
	}

	public int getOptionalOne() {
		return optionalOne;
	}

	public int getOptionalTwo() {
		return optionalTwo;
	}

	public int getOptionalThree() {
		return optionalThree;
	}
	
	/**
	 * Private constructor which will take {@link Builder} as a parameter to it.
	 * Builder will contain all the information that needs to create an instance
	 * of {@link QuantityBuilder}.
	 * 
	 * @param builder
	 */
	private QuantityBuilder(Builder builder) {
		/** Set mandatory fields */
		this.valueOne = builder.valueOne;
		this.valueTwo = builder.valueTwo;
		this.valueThree = builder.valueThree;

		/** Set optional fields */
		this.optionalOne = builder.optionalOne;
		this.optionalTwo = builder.optionalTwo;
		this.optionalThree = builder.optionalThree;
	}

	/**
	 * This is the class that helps in creating/building the instance of complex
	 * {@link QuantityBuilder} where you might or might not need all the
	 * parameters in a class.
	 * 
	 * @author Pankaj Jakhar.
	 *
	 */
	public static class Builder {
		/** These all are mandatory fields. */
		private final int valueOne;
		private final int valueTwo;
		private final int valueThree;

		public Builder(int one, int two, int three) {
			this.valueOne = one;
			this.valueTwo = two;
			this.valueThree = three;
		}

		/**
		 * Optional values - Set all these to default. Because in case client of
		 * {@link QuantityBuilder} has not invoked setter on every optional
		 * value then default values will take their place. Instead in case of
		 * other Data Type you might end up crashing your application.
		 */
		private int optionalOne = 0;
		private int optionalTwo = 0;
		private int optionalThree = 0;

		/**
		 * sets the optional value and returns current state of Builder
		 * instance.
		 * 
		 * @param optionalOne
		 * @return Builder
		 */
		public Builder setOptionalOne(int optionalOne) {
			this.optionalOne = optionalOne;
			return this;
		}

		/**
		 * sets the optional value and returns current state of Builder
		 * instance.
		 * 
		 * @param optionalTwo
		 * @return Builder
		 */
		public Builder setOptionalTwo(int optionalTwo) {
			this.optionalTwo = optionalTwo;
			return this;
		}

		/**
		 * sets the optional value and returns current state of Builder
		 * instance.
		 * 
		 * @param optionalThree
		 * @return Builder
		 */
		public Builder setOptionalThree(int optionalThree) {
			this.optionalThree = optionalThree;
			return this;
		}

		/**
		 * Calling build on Builder instance actually initializes all the
		 * parameters inside your {@link QuantityBuilder} class and finally
		 * returns {@link QuantityBuilder} instance to the client.
		 * 
		 * @return {@link QuantityBuilder}.
		 */
		public QuantityBuilder build() {
			return new QuantityBuilder(this);
		}
	}

}
