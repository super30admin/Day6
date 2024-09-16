// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

import java.util.HashSet;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        int palinLength = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++) {
            char currChar = s.charAt(i);

            // if char not in set, add it
            if(!set.contains(currChar)) {
                set.add(currChar);
            // if char present in set, add 2 to palindrome length and remove from set
            } else {
                palinLength = palinLength + 2;
                set.remove(currChar);
            }
        }

        if(!set.isEmpty()) {
            return palinLength + 1;
        }
 
        return palinLength;
    }
}