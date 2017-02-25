package com.liferay.tongues.functional.composition;

import org.junit.Assert;
import org.junit.Test;

public class JavaHigherOrderFunctionsTests {

    @Test
    public void testValidateIsEven() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate even number is not even",
            JavaHigherOrderFunctions.validate.apply(JavaHigherOrderFunctions.isEven, 2));
    }

    @Test
    public void testValidateIsOdd() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate odd number is not odd",
            JavaHigherOrderFunctions.validate.apply(JavaHigherOrderFunctions.isOdd, 1));
    }

    @Test
    public void testValidateIsEvenAnonymousFunction() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate even number (anonymous function) is not even",
            JavaHigherOrderFunctions.validate.apply((x) -> (x % 2 == 0), 2));
    }

    @Test
    public void testValidateIsOddAnonymousFunction() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate odd number (anonymous function) is not odd",
            JavaHigherOrderFunctions.validate.apply((x) -> (x % 2 != 0), 1));
    }

}
