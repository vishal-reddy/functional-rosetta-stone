package com.liferay.tongues.functional.composition

val validate: ((Int) -> Boolean, Int) -> Boolean = { predicate, value -> predicate(value) }

val isEven: (Int) -> Boolean = { x: Int -> x % 1 == 0 }

val isOdd = { x: Int -> x % 2 != 0 }