// Time Complexity : O(n) where n is the length of input Strinf
// Space Complexity : O(26) == O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*
 * We can form a palindrome with same char in multiple of 2 and we can also include one odd times occuring char
 * In this approach, a set is used to keep track of any unique chars.
 * if we see any char for the first time, we just push the char into set --> meaning it is odd
 * if we see a char already existing in set, we know that we found a pair --> count += 2 and remobve the char from set
 * 
 * Finally check if the set is not empty --> should be containing all the chars with 1 occurence
 * If set is not empty, we add 1 as we can accomodate 1 char in middle of palindrome.
 */

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int resCount = 0;
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if (set.contains(ch)) {
                // we can form a pair and remove the char from set.
                resCount += 2;
                set.remove(ch);
            } else {
                // just insert the char in set
                set.add(ch);
            }
        }
        
        return set.isEmpty() ? resCount : resCount + 1;
    }
}