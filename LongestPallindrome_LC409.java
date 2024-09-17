/**
 * Maintain a HashSet to keep track of characters and count to keep track of length of pallindrome
 * When a new char is seen, add it to set
 * When it already exists in set, you found a pair so remove from set and do count + 2
 * After wh
 */

// Time Complexity: O (N) N: length of string
// Space Complexity: O(N) worst case all characters are unique
// Did this code successfully run on Leetcode : Yes
import java.util.HashSet;
import java.util.Set;

public class LongestPallindrome_LC409 {
    public int longestPalindrome(String s) {
        // Handle empty input
        if (s == null || s.length() == 0)
            return 0;

        int count = 0;                              // Keep track of length of pallindrome
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!charSet.contains(c))               // If c is not in set, add it
                charSet.add(c);
            else {                                  // If c is in set, remove it and increment count by 2 so as to form pallindrome cc
                charSet.remove(c);
                count += 2;
            }
        }
        return charSet.size() > 0 ? count + 1 : count;      // If there is an extra char in hashset, it can be center element
    }
}
