package com.home.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void solution() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        int result = binarySearch.solution(nums, target);
        assertEquals(expected, result);
    }
}