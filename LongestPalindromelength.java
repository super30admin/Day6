import java.util.HashSet;

// Time Complexity : O(n) where n is the length of the given string.
// Space Complexity : O(1) 52 unique characters doesnt change.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                count = count + 2; // if element already exists, then update count and remove element.
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) { // only elements with odd occurence will be left in the Hashset so consider 1 of
                              // those elements
            count++;
        }

        return count;

    }
}