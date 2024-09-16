//T: O(N)
//S: O(1)
class Solution {
        public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int i: count) {
            ans += i / 2 * 2;
            if (ans % 2 == 0 && i % 2 == 1)
                ans++;
        }
        return ans;
    }
}
