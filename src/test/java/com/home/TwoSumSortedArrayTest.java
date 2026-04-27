package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumSortedArrayTest {

    private final TwoSumSortedArray twoSumSortedArray = new TwoSumSortedArray();

    @Test
    void twoSum_typicalInput() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{1, 2}, twoSumSortedArray.twoSum(numbers, target));
    }

}