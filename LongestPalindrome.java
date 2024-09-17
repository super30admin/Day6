// Time Complexity : O(n)
// Space Complexity : O(1) because max we can have 52 alphabets in the hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: If we are having any character that appears twice then we can use that and 
// increment our count by 2 and in the end if we have any characters that appear 
// only once then we are going to increment that count by one and return the final count.

import java.util.HashSet;
class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count  = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count+=2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) count+=1;
        return count;
    }
}