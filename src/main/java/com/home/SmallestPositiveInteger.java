package com.home;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array A of N integers, return the smallest positive integer that does not occur in A.
 */
public class SmallestPositiveInteger {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) set.add(a);
        }
        int i = 1;
        while (set.contains(i)) i++;
        return i;
    }
}
