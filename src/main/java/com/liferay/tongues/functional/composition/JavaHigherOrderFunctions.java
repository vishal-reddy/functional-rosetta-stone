package com.liferay.tongues.functional.composition;

import java.util.function.BiFunction;
import java.util.function.Function;

public class JavaHigherOrderFunctions {
    static BiFunction<Function<Integer, Boolean>, Integer, Boolean> validate = (predicate, value) -> predicate.apply(value);

    static Function<Integer, Boolean> isEven = (x) -> (x % 2 == 0);

    static Function<Integer, Boolean> isOdd = (x) -> (x % 2 != 0);
}
