import java.util.HashSet;

// Time Complexity : O(N) [N: length of string]
// Space Complexity : O(N) [as we are using hash set]
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// We use hash set to push the each character of the string.
// Whenever we find the character again (i.e. the pair) we increment the counter by 2
// At the end we check if hash set has any character in it, 
// then we can have that character at the center of the palindrome, thus we increase count by 1
class Solution3 {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count = count + 2;
            } else {
                set.add(s.charAt(i));
            }
        }

        if (!set.isEmpty()) {
            count++;
        }

        return count;
    }
}
