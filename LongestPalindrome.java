package Oct20;

import java.util.HashSet;
import java.util.Set;

class LongestPalindrome {
	
    public int longestPalindrome(String s) {
        
// Time Complexity: O(n) where n is length of string.
// Because we are traversing the string once completely to populate and depopulate the hashset.

// Space Complexity: O(1) 
// If all characters in string are different, they can be at max 26. So, hashmap will have 26 entries at max.
        
// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Approach: Used hashset to process the string in one pass.
        
        // edge case
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int sLen = s.length();
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        // iterate through given string to process each character
        for (int i = 0; i < sLen; i++) {
            char temp = s.charAt(i);
             // if character already exists in hashset => the character freq is even, so palindrome is possible using that character pair. So, increase count by 2.
            // if character doesnt exist in hashset, add it to hashset.
            if (set.contains(temp)) {
                set.remove(temp);
                count = count + 2;
            } else {
                set.add(temp);
            }
        }
        
        // check if any characters still exist in hashset 
        // if yes => they don't have a pair element same as them, so any one of them can be used to form the palidrome. So, increase count by 1.
        // if no => keep the count same as what we found in prev lines of code and return the same at the end of function
        if (!set.isEmpty()) {
            count++;
        }
        
        return count;
    }
}