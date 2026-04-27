package com.home;

public class ContainerWithMostWater {

    // Optimized O(N) Two-Pointer Solution
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // Brute-force O(N^2) Solution for reference
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for (int x = 0; x < height.length - 1; x++) {
            for (int y = height.length - 1; y > x; y--) {
                int w = y - x;
                int h = Math.min(height[x], height[y]);
                int area = w * h;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
