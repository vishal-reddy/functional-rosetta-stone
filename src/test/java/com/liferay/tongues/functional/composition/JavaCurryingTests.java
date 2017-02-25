package com.liferay.tongues.functional.composition;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class JavaCurryingTests {

    @Test
    public void testCurryingFunctionSumFive() {
        Assert.assertArrayEquals(
            "sum five does not apply to every item in an array",
            new int[] {5, 6, 7, 8, 9, 10},
            Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).map(JavaCurrying.sumFive::apply).toArray()
        );
    }

    @Test
    public void testCurryingFunctionSumTen() {
        Assert.assertArrayEquals(
            "sum ten does not apply to every item in an array",
            new int[] {10, 11, 12, 13, 14, 15},
            Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).map(JavaCurrying.sumTen::apply).toArray()
        );
    }

    @Test
    public void testCurryingFunctionSumTenAnonymousFunction() {
        Assert.assertArrayEquals(
            "sum ten anonymous function does not apply to every item in an array",
            new int[] {10, 11, 12, 13, 14, 15},
            Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).map((x) -> JavaCurrying.sum.apply(x, 10)).toArray()
        );
    }

}
