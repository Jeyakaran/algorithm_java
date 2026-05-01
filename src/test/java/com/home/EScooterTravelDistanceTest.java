package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EScooterTravelDistanceTest {
    private final EScooterTravelDistance eScooterTravelDistance = new EScooterTravelDistance();

    @Test
    void solution() {
        int endpoint = 20;
        int[] scooters = {7, 4, 14};
        int result = eScooterTravelDistance.solution(endpoint, scooters);
        assertEquals(16, result);
    }
}