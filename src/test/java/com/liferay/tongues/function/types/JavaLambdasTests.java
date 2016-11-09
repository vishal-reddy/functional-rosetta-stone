package com.liferay.tongues.function.types;

import org.junit.Assert;
import org.junit.Test;

public class JavaLambdasTests {

	@Test
	public void addThisTest() {
		Assert.assertEquals("Java lambdas don't really work",
			JavaLambdas.addThis.apply(Integer.valueOf(1), Integer.valueOf(1)),
			Integer.valueOf(2));
	}

}