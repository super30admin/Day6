
// Time Complexity : O(n) , nums array traversed once
// Space Complexity : O(n) for hashset
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        int countEven = 0;
        
        for (int i = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i))){
                countEven++;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        
        }
        if (set.isEmpty()) return countEven * 2; // set empty means all chars have a pair
        return countEven * 2 + 1;

    }
}