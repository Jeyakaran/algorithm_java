package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesInPlaceTest {
    private final RemoveDuplicatesInPlace removeDuplicates = new RemoveDuplicatesInPlace();

    @Test
    void removeDuplicates_1() {
        int[] nums = {1, 1, 2};
        int actual = removeDuplicates.removeDuplicates(nums);
        assertEquals(2, actual);
    }

    @Test
    void removeDuplicates_2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actual = removeDuplicates.removeDuplicates(nums);
        assertEquals(5, actual);
    }
}