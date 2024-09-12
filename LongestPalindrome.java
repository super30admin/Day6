//Time Complexity: O(n)
//Space Complexity:public static final String var = ;
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// of the chars present we can use all the even number of characters, if odd are present we can only use 1 of them

class LongestPalindrome {
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
