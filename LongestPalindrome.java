//Time Complexity: O(s.length)
//Space Complexity: O(s.length)
// Did this code successfully run on Leetcode :Yes

import java.util.HashSet;

public class LongestPalindrome {
        public int longestPalindrome(String s) {
            HashSet<Character> set = new HashSet<>();
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (set.contains(c)) {
                    result += 2;
                    set.remove(c);
                } else {
                    set.add(c);
                }
            }
            if (!set.isEmpty()) result++;
            return result;

        }
}
