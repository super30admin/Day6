// Time Complexity : O(N)
// Space Complexity : O(1), Because the set would contain maximum 26 characters at any point of time.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We observe that a palindrome can be of even length or odd length. If it is even, then all the characters will appear even
// number of times, so the length of longest palindrome would be counting the characters even number of time.
// To make it odd length palindrome, of all the possible characters, one character can appear odd number of time.
// I can keep characters in a set, if they appear again in the input string, I can count that pair in palindrome.
// Once all pairs are done, I can add one to the count if any characters remain in set;

import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aaabbbcd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int len = s.length();
        if (len == 0) return 0;
        if (len == 1) return 1;

        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            Character curr = s.charAt(i);
            if (set.contains(curr)) {
                maxLength += 2;
                set.remove(curr);
            } else {
                set.add(curr);
            }
        }

        if (!set.isEmpty()) {
            maxLength += 1;
        }
        return maxLength;
    }
}
