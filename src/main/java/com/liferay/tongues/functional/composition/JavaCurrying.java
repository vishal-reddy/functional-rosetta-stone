package com.liferay.tongues.functional.composition;

import java.util.function.BiFunction;
import java.util.function.Function;

public class JavaCurrying {

    static BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

    static Function<Integer, Integer> sumFive = (a) -> sum.apply(a, 5);

    static Function<Integer, Integer> sumTen = (a) -> sum.apply(a, 10);

}
