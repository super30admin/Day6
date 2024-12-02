import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : None.

class longestPalindrome {
    public int longestPalindrome(String s) {
     int count = 0;
     Map<Character, Integer> map = new HashMap<>();

     for(char c: s.toCharArray()) {
         if(!map.containsKey(c)) {
             map.put(c,1);
         }
         else{
             map.remove(c);
             count = count + 2;
         }
     }
     if (count < s.length()) count++;
     return count;

    }
}
