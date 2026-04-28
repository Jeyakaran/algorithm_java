package com.home;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubArraySum {
    /**
     * Maximum Sum of Distinct Subarrays With Length K
     * You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
     * <p>
     * The length of the subarray is k, and
     * All the elements of the subarray are distinct.
     * Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within an array.
     */
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        int left = 0;
        Set<Integer> windowElements = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            while (windowElements.contains(nums[right])) {
                windowElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            windowElements.add(nums[right]);
            currentSum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                windowElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
