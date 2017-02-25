package com.liferay.tongues.special.functions;

import java.util.Arrays;

public class JavaStreamFunctions {

    public static int[] someWholeNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public static int[] getDoubledWholeNumbersUsingMap() {
        return Arrays.stream(someWholeNumbers).map(x -> x * 2).toArray();
    }

    public static int[] getFilteredEvenWholeNumbersUsingFilter() {
        return Arrays.stream(someWholeNumbers).filter(x -> x % 2 == 0).toArray();
    }

}
