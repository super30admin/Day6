// Time Complexity : O(n) where n is the length of the input string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using a HashSet to track unmatched characters and adding 2 to the result for each pair of
// matching characters, while allowing one unpaired character in the center of the palindrome.


class LongestPalindromeLength {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.add(ch)) {
                result += 2;
                set.remove(ch);
            }
        }
        if (!set.isEmpty()) {
            result++;
        }
        return result;
    }
}