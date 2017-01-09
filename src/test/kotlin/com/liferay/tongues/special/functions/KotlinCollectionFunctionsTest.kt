package com.liferay.tongues.special.functions

import kotlin.collections.listOf

import org.junit.Assert
import org.junit.Test

class KotlinCollectionFunctionsTest {

    @Test
    fun doubledWholeNumbersUsingMapTest() {
        Assert.assertEquals(
            "The doubling of numbers with map failed", doubledWholeNumbersUsingMap,
                listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40))
    }

    @Test
    fun filteredEvenNumbersUsingMap() {
        Assert.assertEquals(
            "The filtering of evem numbers with map failed", filteredEvenWholeNumbersUsingFilter,
                listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
    }

}
