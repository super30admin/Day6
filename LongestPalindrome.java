// Problem 409. Longest Palindrome
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.HashMap;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int len = 0;
        boolean odd = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int count : map.values()) {
            if (count % 2 == 0) {
                len += count;
            } else {
                len += count - 1;
                odd = true;
            }
        }
        if (odd) {
            len += 1;
        }
        return len;
    }
}
