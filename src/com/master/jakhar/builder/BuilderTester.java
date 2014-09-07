package com.master.jakhar.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTester {

	@Test
	public void test() {
		QuantityBuilder quantityBuilder = new QuantityBuilder.Builder(1, 2, 3)
				.setOptionalOne(11).setOptionalThree(33).build();

		System.out.println("Running test 1");
		Assert.assertNotEquals(quantityBuilder, null);
		Assert.assertEquals(quantityBuilder.getValueOne(), 1);
		Assert.assertEquals(quantityBuilder.getValueTwo(), 2);
		Assert.assertEquals(quantityBuilder.getValueThree(), 3);
		Assert.assertEquals(quantityBuilder.getOptionalOne(), 11);
		Assert.assertEquals(quantityBuilder.getOptionalTwo(), 0);
		Assert.assertEquals(quantityBuilder.getOptionalThree(), 33);
		
		
	}

}
