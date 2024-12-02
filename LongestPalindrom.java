// Time Complexity : O(n2)
// Space Complexity :O(n), n is the length of the string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        if (s.length() > 0) {
			int[] charFrequency = new int[130];
			for (char c : s.toCharArray()) {
				charFrequency[c] += 1;
			}

			int palindromeMaxLenth = 0;
			for (int frequency : charFrequency) {
				// taking even values. For ex:aaa,we will ignore
				// one a and will take two a's
				palindromeMaxLenth += frequency / 2 * 2;

				// checking for extra character
				if (palindromeMaxLenth % 2 == 0 && frequency % 2 == 1) {
					palindromeMaxLenth++;
				}
			}
			return palindromeMaxLenth;
		}
		return -1;
    }
}
