package com.liferay.tongues.function.types;

import java.util.function.BiFunction;

public class JavaLambdas {
	public static BiFunction<Integer, Integer, Integer> addThis = (a, b) -> a + b;
}