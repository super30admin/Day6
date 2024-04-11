// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

/*
 * Longest palindrome: given a group of characters.. and we have to find the longest palindrome we can construct
 * 
 * Approach: 
 * Keep track of the unique values in a set.. if we find a duplicate value pop it out and count as 2;
 * in the end if the set is not empty add 1 to the count
 * 
 * 
 */

import java.util.*;

public class LongestPalindrome {

    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return 0;
        int lengthOfPalindrome = 0;

        Set<Character> cache = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (cache.contains(c)) {
                cache.remove(c);
                lengthOfPalindrome += 2;
            } else {
                cache.add(c);
            }
        }

        if (!cache.isEmpty())
            lengthOfPalindrome += 1;

        return lengthOfPalindrome;

    }
}