import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n) n = char in the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * 
 * https://leetcode.com/problems/longest-palindrome/submissions/
 *Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int res = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for(Character c: s.toCharArray()) {
            //if key present, remove key and consider that pair for palindrome
            if(charCountMap.containsKey(c)) {
                res = res + 2;
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        //odd length palindrome
        if(!charCountMap.keySet().isEmpty()){
            res = res + 1;
        }
        
        return res;
    }
}
