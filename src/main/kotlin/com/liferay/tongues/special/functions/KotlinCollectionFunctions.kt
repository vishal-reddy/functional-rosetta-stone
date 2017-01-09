package com.liferay.tongues.special.functions

import kotlin.collections.listOf

val someWholeNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

val doubledWholeNumbersUsingMap = someWholeNumbers.map { it * 2 }

val filteredEvenWholeNumbersUsingFilter = someWholeNumbers.filter { (it % 2) == 0 }