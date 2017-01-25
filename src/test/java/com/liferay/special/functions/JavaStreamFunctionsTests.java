package com.liferay.special.functions;

import org.junit.Assert;
import org.junit.Test;

public class JavaStreamFunctionsTests {

    @Test
    public void testGetDoubledWholeNumbersUsingMap() {
        Assert.assertArrayEquals(
            new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40},
            JavaStreamFunctions.getDoubledWholeNumbersUsingMap());
    }

    @Test
    public void testFilteredEvenWholeNumbersUsingFilter() {
        Assert.assertArrayEquals(
            new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
            JavaStreamFunctions.getFilteredEvenWholeNumbersUsingFilter());
    }

}
