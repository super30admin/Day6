/*
Time Complexity: O(n), where n is the length of the input string.
Space Complexity: O(1), as the maximum number of unique characters stored in the HashSet
                  is constant (52 for English alphabet characters).

Did this code successfully run on Leetcode : Yes
 */

import java.util.HashSet;

class LongestPalindromeUsingHashSet {
    public int longestPalindrome(String s) {

        int count = 0; //to keep a track of length

        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray())
        {
            if(set.contains(c)) {
                count += 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }

        if(set.size() > 0) return count+1;

        return count;
    }
}