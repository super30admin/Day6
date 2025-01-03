// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Used a HashSet to track frequencies of characters. Check if the character exists in the set.
// If yes, increment count by 2 and remove the character from the set. At the end, if set is not empty, increment count by 1.

import java.util.HashSet;

class SolutionLongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                count = count + 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            count++;
        }
        return count;
    }
}
