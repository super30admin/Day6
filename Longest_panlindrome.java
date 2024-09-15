import java.util.*;

class Solution {
    // Time complexity is O(n)
    // Space complexity is O(1)
    // This solution is submitted on leetcode with no errors
    public int longestPalindrome(String s) {
        // Edge case
        if(s == null || s.length() == 0)
            return -1;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i< s.length();i++) {
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            } else {
                set.remove(c);
                result+=2;
            }
        }
        if(!set.isEmpty()) return result+1;
        return result;
    }
}