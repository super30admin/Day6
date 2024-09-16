// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.

// Your code here along with comments explaining your approach
public class Solution {
	public int longestPalindrome(String s) {
		 HashSet<Character> map = new HashSet<>();
		 int res = 0;

		 for (int i = 0; i < s.length(); i++) {
			  char curr = s.charAt(i);
			  if (map.contains(curr)) {
					res += 2;
					map.remove(curr);
			  } else {
					map.add(curr);
			  }
		 }
		 if (map.size() > 0)
			  res++;
		 return res;
	}
}