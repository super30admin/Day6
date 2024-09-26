//Problem : 409. Longest Palindrome
/** 3 Pointer Approcach: 
 * Used HashSet to solve the problem.
 * APPROACH:
 * We need to have pair sets.
 * On First occurance of a character - we can add the chracter in set.
 * On Second occurance of same chracter we can remove that character and ADD 2 to our count.
 * In that manner, we will get all required pairs.
 * In the end if Set is not empty we can take any left character and fit it in the middle of a Palidromed String
 * and hence add 1.
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1) => constant 128 characters, as given in question.  

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

import java.util.*;

class Problem3 {
    public int longestPalindrome(String s) {
        
        Set<Character> set = new HashSet();
        
        int count = 0;
        
        for(char c : s.toCharArray()){
            
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        if(!set.isEmpty()){
            count++;
        }
        
        return count;
    }
}