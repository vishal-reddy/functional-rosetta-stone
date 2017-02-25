package com.liferay.tongues.functional.composition

import org.junit.Assert
import org.junit.Test

class KotlinHigherOrderFunctionsTests {

    @Test
    fun testValidateSumIsEven() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate even number is not even",
            validate(isEven, 2)
        )
    }

    @Test
    fun testValidateSumIsOdd() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate odd number is not odd",
            validate(isOdd, 1)
        )
    }

    @Test
    fun testValidateSumIsEvenAnonymousFunction() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate even number (anonymous function) is not even",
            validate({ x: Int -> x % 2 == 0 }, 2)
        )
    }

    @Test
    fun testValidateSumIsOddAnonymousFunction() {
        Assert.assertTrue(
            "Test Java Higher Order Function validate odd number (anonymous function) is not odd",
            validate({ x: Int -> x % 2 != 0 }, 1)
        )
    }

}
