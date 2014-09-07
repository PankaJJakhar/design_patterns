package com.master.jakhar.builder;

public class QuantityBuilderTester {

	public static void main(String[] args) {

		int one = 1;
		int two = 2;
		int three = 3;
		
		QuantityBuilder quantityBuilderOne = new QuantityBuilder.Builder(one,
				two, three).setOptionalOne(11).build();

		QuantityBuilder quantityBuilderTwo = new QuantityBuilder.Builder(one,
				two, three).setOptionalTwo(22).setOptionalThree(33).build();
		
	}

}
