//https://leetcode.com/problems/longest-palindrome/

//Time complexity : O(N)
//Space complexity : O(1)
class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int count = 0;
        boolean single = false;
        for (int i = 0; i < 128; i++) {
            int frq = freq[i];
            count += (frq / 2);
            if (frq % 2 != 0) {
                single = true;
            }
        }
        return single == true ? count * 2 + 1 : count * 2;
    }
}
© 2021 GitHub, Inc.