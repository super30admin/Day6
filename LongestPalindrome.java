package com.Aug2020.Hashing2;

import java.util.HashSet;
import java.util.Set;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :
//logic behind this was bit tricky to formulate.
public class LongestPalindrome {
	
	public static void main(String[] args) {
		String s = "abccccdd";
		int count = longestPalindrome(s);
		System.out.println("longest palindrome whose length is  => " + count);
	}
	public static int longestPalindrome(String s) {
	      int count = 0;
	    Set<Character> set = new HashSet<Character>();
	        for (char c : s.toCharArray()) {
	            if (!set.contains(c)) {
	                set.add(c);
	            } else {
	                set.remove(c); // remove present element
	                count += 2; // element exist in pair 
	            }
	        }
	        return (!set.isEmpty() ? count + 1 : count);
	    }
}
