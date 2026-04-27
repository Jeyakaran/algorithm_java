package com.home;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSumTest {
    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void threeSum_typicalInput() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = threeSum.threeSum(nums);
        List<List<Integer>> expected = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));
    }

    @Test
    void threeSum_noSolution() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertTrue(actual.isEmpty());
    }

    @Test
    void threeSum_emptyInput() {
        int[] nums = {};
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertTrue(actual.isEmpty());
    }

    @Test
    void threeSum_allZeros() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> actual = threeSum.threeSum(nums);
        List<List<Integer>> expected = List.of(List.of(0, 0, 0));
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));
    }

}