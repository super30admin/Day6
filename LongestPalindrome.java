// Time Complexity : O(n) -  n is the length of string
// Space Complexity : O(1), as the size of string is 26 (alphabets only)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Used Hashset to find the number of paired characters 
 * If a character is found once store it and for
 * the existing ones, remove the character and increment the count by 2
 * for remaining character in set increment the count by 1 and return*/


import java.util.*;

public class LongestPalindrome {
	public static int longestPalindrome(String s) {
		int count =0;
		if(s ==null || s.length()<0)
			return 0;
		
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(set.contains(c)) {		// if set already contains character, remove the character and increment the count by 2
				count+= 2;
				set.remove(c);
			}
			else					// else add the character in set
				set.add(c);
		}
		if(!set.isEmpty())		//for remaining character in set increment the count by 1 and return count
			count++;
		
		return count;	
	}
	
	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println("Output: " + longestPalindrome(s));
		
	}
}
