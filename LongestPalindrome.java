// Approach: A palindrome is centered around one or two characters depending on its length (odd or even). Any character with
// a frequency of n contributes to a palindrome of length n if n is even, and (n - 1) if n is odd. If there is a character
// with an odd frequency, the one extra character that does not contribute to building the palindrome can be used as the
// center of the palindrome.
// Time Complexity : O(n) where n - s.length()
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Reference: https://youtu.be/VGp_o-YCLWM

import java.util.Map;
import java.util.HashMap;

public class LongestPalindrome {

    int findLongestPalindrome(String s) {
        // character frequency map
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int evenSum = 0, oddSum = 0;
        boolean containsOdd = false;
        for (int i : map.values()) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                containsOdd = true;
                oddSum += (i - 1);
            }
        }
        if (containsOdd) {
            oddSum++;
        }
        return evenSum + oddSum;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String s = "abccccdd";
        System.out.println("Length of longest palindrome that can be built using chars of given string is: " +
                lp.findLongestPalindrome(s));
    }
}