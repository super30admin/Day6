/*
 * #409. Longest Palindrome
 * 
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"

Output: 7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"

Output: 1

Example 3:

Input: s = "bb"

Output: 2
 
Constraints:

1 <= s.length <= 2000
s consits of lower-case and/or upper-case English letters only.

 */


/*
 * Time Complexity: O (N)
 * 
 * Space Complexity: O (N)
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.hashing2;

import java.util.HashSet;

public class LongestPalindrome {
	
	public int longestPalindrome(String s) {
        int count = 0; // Initialize length of longest palindrome
        
        // Create a HashSet to store the characters
        HashSet<Character> hash = new HashSet<Character>();
        
        // Traverse the given string character by character
        for(int i = 0; i < s.length(); i++){
            
        	// Take the character at ith index from string 's'
            char ch = s.charAt(i);
            
            // Check if the particular character is present in a HashSet
            // If yes, then increment count by 2 (current + previous character eg: c encountered two times)
            if(hash.contains(ch)){
               count += 2;
                
               hash.remove(ch); // After incrementing count, remove that character from HashSet
            }
            // Else, add the character to HashSet
            else{
                hash.add(ch);
            }
            
        }
        // When we are done with traversing the string, if HashSet is empty, return the count
        // Else, return count + 1 -> no matter how many characters are present in HashSet after finish traversing 
        return hash.isEmpty()?count:count + 1; 
    }
	
}
