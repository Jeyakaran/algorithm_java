package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {
    private final NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

    @Test
    void sumRange() {
        int actual = numArray.sumRange(0, 2);
        assertEquals(1, actual);
    }
}