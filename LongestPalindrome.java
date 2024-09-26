// Time Complexity : O(N)
// Space Complexity : O(1) //no of unique characters a-z,A-Z constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. create a set to have previous characters.
 * 2. if character not exist insert. if already exist remove and increase count by 2.
 * 3. at the end if set have 1 count element means not empty add 1 that can be at the middle.
 */
import java.util.HashSet;
import java.util.Set;


public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int count=0;
		Set<Character> set= new HashSet<>();
		for(char c:s.toCharArray()) {
			if(set.contains(c)) {
				set.remove(c);
				count= count+2;
			}else {
				set.add(c);
			}
		}
		if(!set.isEmpty()) {
			count = count +1;
		}
		
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(new LongestPalindrome().longestPalindrome("aaabaa"));
	}
}
