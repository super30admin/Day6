import java.util.*;

//Time Complexity : o(n) - total no of characters
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : yes
public class LongestPalindrome {

	public int longestPalindrome(String s) {

		if (s.length() == 0)
			return 0;

		int result = 0;
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// if char exist in set means we can add that chars to make Palindrome
			if (set.contains(c)) {
				result += 2;
				//remove char so we won't count that again
				set.remove(c);
			} else {
				//if it is not present in set add
				set.add(c);
			}
		}
		
		// if set set is not empty then we can add one more character in center
		if (!set.isEmpty())
			result++;

		return result;
	}

}
