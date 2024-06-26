// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                count += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        if (!set.isEmpty()) count++;
        return count;
    }
}