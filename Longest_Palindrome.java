// 409. Longest Palindrome - https://leetcode.com/problems/longest-palindrome/
// Time Complexity: O(N), where N is the length of s. We need to count each letter.
//Space Complexity: O(1)

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}