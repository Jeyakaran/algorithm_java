package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArraySumTest {

    private final MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();

    @Test
    void example01() {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long expected = 15;
        long result = maximumSubArraySum.maximumSubarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    void example02() {
        int[] nums = {4, 4, 4};
        int k = 3;
        long expected = 0;
        long result = maximumSubArraySum.maximumSubarraySum(nums, k);
        assertEquals(expected, result);
    }
}