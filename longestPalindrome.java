// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No 

import java.util.HashSet;

public class longestPalindrome {

    public static int getlongestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (!set.isEmpty()) count++;

        return count;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(getlongestPalindrome(str));
    }
}
