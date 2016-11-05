package com.liferay.tongues.lambdas

import org.junit.Assert
import org.junit.Test

class KotlinLambdasTest {

    @Test
    fun addThisTest() {
        Assert.assertTrue(addThis(1, 1) == 2)
    }

}