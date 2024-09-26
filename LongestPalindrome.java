// Time Complexity : O(n)
// Explaination : n is length of String s as we go through each char in s once
// Space Complexity : O(1)
// Explaination : max length of set will be upper case char + lower case char in worst case
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no
// Time taken : 5

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return -1;

        Set<Character> set = new HashSet<>();
        int count = 0;
        for(Character c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count += 2;
            }
            else
                set.add(c);
        }
        if(!set.isEmpty())
            count++;
        return count;
    }
}
