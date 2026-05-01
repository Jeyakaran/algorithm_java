package com.home;

/**
 * You are given a string S, which contains a paragraph separated by characters such as ', ','. ','? ', or '! '.
 * Find the sentence that contains the maximum number of words.
 */
public class MaxNumberOfWords {
    public int maxNumberOfWords(String S) {
        String[] sentences = S.split("[,.!?] ");
        int maxLength = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxLength = Math.max(maxLength, words.length);
        }
        return maxLength;
    }
}
