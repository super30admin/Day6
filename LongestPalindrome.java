// Time Complexity: O(n) where n is length of input array
// Space Complexity: O(1)
// Solved in leetcode: Yes
// Problems occured : No

import java.util.HashSet;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (set.size() > 0) return count + 1;
        return count;
    }

    public static void main(String[] args) {
        LongestPalindrome solver = new LongestPalindrome();

        // Example 1
        String s1 = "abccccdd";
        System.out.println("Example 1 Output: " + solver.longestPalindrome(s1)); // Output: 7

        // Example 2
        String s2 = "a";
        System.out.println("Example 2 Output: " + solver.longestPalindrome(s2)); // Output: 1
    }
}
