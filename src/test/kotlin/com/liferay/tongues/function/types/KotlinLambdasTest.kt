package com.liferay.tongues.function.types

import org.junit.Assert
import org.junit.Test

class KotlinLambdasTest {

    @Test
    fun addThisTest() {
        Assert.assertTrue(addThis(1, 1) == 2)
    }

}