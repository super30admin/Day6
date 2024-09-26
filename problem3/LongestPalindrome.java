// Time Complexity : O(n) : n -> size of string
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

package problem3;

public class LongestPalindrome {
	/*
	 * Traverse through the string, getting the count of each character. If the same
	 * character occurs twice, increment count twice, and reset the character count.
	 */
	public int longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		if (s.length() == 1) {
			return 1;
		}

		int[] cnt = new int[128];
		int palindromeLength = 0;
		for (char ch : s.toCharArray()) {
			cnt[ch]++;
			if (cnt[ch] == 2) {
				palindromeLength += 2;
				cnt[ch] = 0;
			}
		}

		return palindromeLength == s.length() ? palindromeLength : palindromeLength + 1;
	}

	public static void main(String[] args) {
		LongestPalindrome obj = new LongestPalindrome();
		System.out.println(
				"Longest palindrome length of string \"abababdddabdbac\":" + obj.longestPalindrome("abababdddabdbac"));
	}

}
