package com.liferay.tongues.function.types;

import com.liferay.tongues.function.types.JavaPureFunctions.MutableSideVariableClass;
import com.liferay.tongues.function.types.JavaPureFunctions.ImmutableSideVariableClass;

import org.junit.Assert;
import org.junit.Test;

public class JavaPureFunctionsTests {

	@Test
	public void mutableSideVariableTest() {
		JavaPureFunctions javaPureFunctions = new JavaPureFunctions();

		MutableSideVariableClass mutableSideVariableObject =
			javaPureFunctions.new MutableSideVariableClass();

		Assert.assertEquals("Initial Value is not 2",
			2,
			mutableSideVariableObject.getSideVariable());

		Assert.assertEquals("This operation fails to perform addition",
			2,
			mutableSideVariableObject.addThisAndDoMore(1, 1));

		Assert.assertEquals("There are no side effects for the function above",
			3,
			mutableSideVariableObject.getSideVariable());
	}

	@Test
	public void immutableSideVariableTest() {
		JavaPureFunctions javaPureFunctions = new JavaPureFunctions();

		ImmutableSideVariableClass immutableSideVariableObject =
			javaPureFunctions.new ImmutableSideVariableClass();

		Assert.assertEquals("Initial Value is not 2",
			2,
			immutableSideVariableObject.getSideVariable());

		Assert.assertEquals("This operation fails to perform addition",
			2,
			immutableSideVariableObject.addThisAndDoNothingElse(1, 1));

		Assert.assertEquals("There are no side effects for the function above",
			2,
			immutableSideVariableObject.getSideVariable());
	}

}