package com.home;

import java.util.Arrays;

/**
 * Imagine you are at position 0 on an infinitely long line and need to reach a specific endpoint. Along this line, there are several e-scooters at predefined positions. You must follow these rules:
 * <p>
 * You start at position = 0.
 * You walk until you encounter the nearest available e-scooter.
 * Once you pick up an e-scooter, you must travel exactly 10 units with it. You cannot stop short or go further.
 * After traveling 10 units, you dismount the scooter and look for the next available scooter from your new position.
 * The process continues until you reach or surpass the endpoint.
 * Calculate the total distance you traveled using e-scooters.
 * <p>
 * Input Format:
 * An integer endpoint representing the target position.
 * An array of integers scooters representing the initial positions of available e-scooters.
 * Output Format:
 * An integer representing the total distance covered by e-scooters.
 * Example 1:
 * Input:
 * endpoint = 20
 * scooters = [7, 4, 14]
 * <p>
 * Output:
 * 16
 * <p>
 * Explanation
 * 1. Start at position 0. Available scooters are at [4, 7, 14] (sorted).
 * 2. Walk from 0 to 4 to reach the first scooter. (Scooter distance: 0)
 * 3. Take scooter from 4. Travel 10 units. New position: 4 + 10 = 14. (Scooter distance: 10)
 * 4. At position 14, an e-scooter is available (from the original input, since new scooters aren't generated).
 * 5. Take scooter from 14. Travel 6 units. New position: 14 + 6 = 20. (Scooter distance: 10 + 6 = 16)
 * 6. Current position (20) is beyond or at the endpoint (20). Stop.
 * Total distance traveled using scooters: 20.
 * Constraints:
 * 1 <= endpoint <= 10^5
 * 1 <= scooters.length <= 10^4
 * 0 <= scooters[i] <= endpoint + 100 (scooters can be slightly beyond the endpoint to be reachable)
 * All scooter positions are distinct.
 */
public class EScooterTravelDistance {
    public int solution(int endpoint, int[] scooters) {
        if (scooters.length == 0) return 0;
        Arrays.sort(scooters);
        int currentPosition = 0;
        int totalScooterDistance = 0;

        for (int scooter : scooters) {
            if (scooter < currentPosition) continue;

            int nextPosition = scooter + 10;
            if (nextPosition >= endpoint) {
                totalScooterDistance += (endpoint - scooter);
                break;
            } else {
                totalScooterDistance += 10;
                currentPosition = nextPosition;
            }
        }
        return totalScooterDistance;
    }
}
