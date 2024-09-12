// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] count = new int[128];

        for(char c: s.toCharArray())
        {
            count[c]++;
        }
        for (int v: count)
        {
            ans += v / 2 * 2;
            if((ans % 2 == 0) && (v % 2 == 1))
               ans++;
        }
        return ans;
    }
}