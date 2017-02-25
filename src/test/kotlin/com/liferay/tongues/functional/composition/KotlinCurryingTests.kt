package com.liferay.tongues.functional.composition

import org.junit.Assert
import org.junit.Test

class KotlinCurryingTests {

    @Test
    fun testCurryingFunctionSumFive() {
        Assert.assertEquals(
            "sum five applies to every item in a collection",
            listOf(5, 6, 7, 8, 9, 10),
            listOf(0, 1, 2, 3, 4, 5).map(sumFive)
        )
    }

    @Test
    fun testCurryingFunctionSumTen() {
        Assert.assertEquals(
            "sum ten applies to every item in a collection",
            listOf(10, 11, 12, 13, 14, 15),
            listOf(0, 1, 2, 3, 4, 5).map(sumTen)
        )
    }

    @Test
    fun testCurryingFunctionSumTenPartialApplication() {
        Assert.assertEquals(
            "sum ten applies to every item in a collection",
            listOf(10, 11, 12, 13, 14, 15),
            listOf(0, 1, 2, 3, 4, 5).map(sum(10))
        )
    }

}
