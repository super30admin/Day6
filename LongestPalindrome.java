package hashing2;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	//Time Complexity : O(n), where n is the length of string s
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        
        int longestPalindrome = 0;
        Map<Character, Integer> characterCount = new HashMap<>();
        
        for(char c: s.toCharArray())
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        
        boolean oddCount = false;
        for(char c: characterCount.keySet()) {
            if(characterCount.get(c) % 2 == 0)
                longestPalindrome += characterCount.get(c);
            else {
                longestPalindrome += characterCount.get(c) - 1;
                oddCount = true;
            }
        }
        
        return oddCount == true ? longestPalindrome + 1: longestPalindrome;
    }
}
