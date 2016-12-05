package com.liferay.tongues.function.types

var a = 1
val b: Int = 2

fun addThisAndDoMore(x: Int, y: Int): Int {
    // This function modifies variables outside of it's scope making it impure
    a = 3
    return x + y
}

fun addThisAndDoNothingElse(x: Int, y: Int): Int {
    //Inputs and outputs are clear in this function no side effects are visible
    return x + y
}