
// Time Complexity : O(n) Where n is the length of the string
// Space Complexity : O(1) since using a constant size character array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem3 {
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

    public static void main(String[] args) {
        String s = "aaddabab";
        Problem3 obj = new Problem3();
        System.out.println(obj.longestPalindrome(s));
    }
}
