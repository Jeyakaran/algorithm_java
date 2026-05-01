package com.home;

/**
 * Given two strings s1 and s2, the task is to find the minimum number of steps required to convert s1 into s2. The only operation allowed is to swap adjacent elements in the first string. Every swap is counted as a single step.
 * <p>
 * Input: s1 = "abcd", s2 = "cdab"
 * Output: 4
 * Swap 2nd and 3rd element, abcd => acbd
 * Swap 1st and 2nd element, acbd => cabd
 * Swap 3rd and 4th element, cabd => cadb
 * Swap 2nd and 3rd element, cadb => cdab
 * Minimum 4 swaps are required.
 * Input: s1 = "abcfdegji", s2 = "fjiacbdge"
 * Output:17
 */
public class SwapString {

    public int solution(String s1, String s2) {
        int count = 0;
        char[] chars = s1.toCharArray();
        for (int x = 0; x < s2.length(); x++) {
            if (s2.charAt(x) != chars[x]) {
                int i = x;
                while (i < chars.length && chars[i] != s2.charAt(x)) {
                    i++;
                }
                while (i > x) {
                    char temp = chars[i];
                    chars[i] = chars[i - 1];
                    chars[i - 1] = temp;
                    i--;
                    count++;
                }
            }
        }
        return count;
    }
}
