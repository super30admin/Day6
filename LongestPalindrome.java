package day6;

import java.util.*;
//Time Complexity : O(n) where n is length of s
// Space Complexity : O(1) [space required by count variable]
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : it took time for me to understand the solution concept

// Your code here along with comments explaining your approach
public class LongestPalindrome {

	public static int longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		// we use hashset to find the number of paired characters
		HashSet<Character> hs = new HashSet<Character>();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				hs.remove(s.charAt(i));
				count++;
			} else {
				hs.add(s.charAt(i));
			}
		}
		// if there is one character left, it can be adjusted in the center of
		// Palindrome string output
		if (!hs.isEmpty()) {
			return count * 2 + 1;
		}
		return count * 2;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd"));
	}

}
