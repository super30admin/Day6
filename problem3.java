// Problem3 (https://leetcode.com/problems/longest-palindrome)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem3 {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // s.toChar(i);
            char d = s.charAt(i);
            if (map.contains(d)) {
                result += 2;
                map.remove(d);
            } else {
                map.add(d);
            }
        }
        if (map.size() > 0)
            result++;
        return result;
    }
}
