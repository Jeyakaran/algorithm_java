package com.home.jp;

/**
 * You are given two strings, word1 and word2. Merge the strings by adding letters in alternating order, starting with the word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * <p>
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * <p>
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * <p>
 * Constraints:
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int word1Size = word1.length();
        int word2Size = word2.length();
        int maxLength = Math.max(word1Size, word2Size);
        for (int i = 0; i < maxLength; i++) {
            if (i < word1Size) {
                result.append(word1.charAt(i));
            }
            if (i < word2Size) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
