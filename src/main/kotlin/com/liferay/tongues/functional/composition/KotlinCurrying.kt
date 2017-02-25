package com.liferay.tongues.functional.composition

import org.funktionale.currying.curried

val sum = { a: Int, b: Int -> a + b }.curried()

val sumFive = sum(5)

val sumTen = sum(10)

val fifteen = sum(5)(10)