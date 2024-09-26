import java.util.*;
public class LongestPalindorme {
	//	Timr: O(n)
	//	Space: O(n)
	//	Leetcode: yes
	//Will store char in a set and if char appears in pair,
	//we will remove from set and 2 to the length.
	//in the end, if set has some single chars left, then add 1 to length
	public int longestPalindrome(String s) {
		Set<Character> set = new HashSet<>();
		int ans = 0 ;
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(set.contains(c)) {
				set.remove(c);
				ans += 2; 
			}else {
				set.add(c);
			}
		}
		if(!set.isEmpty()) {
			ans += 1; 
		}
		return ans;
	}
}