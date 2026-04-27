package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    void maxArea_typicalInput() {
        assertEquals(49, container.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(49, container.maxAreaBruteForce(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void maxArea_singleElement() {
        assertEquals(1, container.maxArea(new int[]{1, 1}));
        assertEquals(1, container.maxAreaBruteForce(new int[]{1, 1}));
    }

}