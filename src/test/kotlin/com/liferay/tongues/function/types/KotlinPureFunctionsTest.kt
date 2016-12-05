package com.liferay.tongues.function.types

import org.junit.Assert
import org.junit.Test

class KotlinPureFunctionsTest {

    @Test
    fun addThisAndDoMoreTest() {
        Assert.assertTrue(addThisAndDoMore(1, 1) == 2)

        Assert.assertTrue(a == 3)
    }

    @Test
    fun addThisAndDoNothingElseTest() {
        Assert.assertTrue(addThisAndDoNothingElse(1, 1) == 2)

        Assert.assertTrue(b == 2)
    }

}