// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

//1) firstly ,count the occurences of each character and store the frequencies in a hash map. 
//2) Then, when a character appears even number of times, we know we can use this letter to extend the candidate string into a palindrome 
//by both sides of the strings – we update the length by the number of the characters. 
//3) If a character appears odd number of times we will increase the length by (t-1).
//4) at the end, the length need to add one because the middle of the palindrome can be a single character.

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromic {
	
	public int longestPalindrome(String s) {
        Map<Character, Integer> data = new HashMap<>();
        for (char n: s.toCharArray()) {
            data.put(n, data.getOrDefault(n, 0) + 1);
        }
        int odd = 0, ans = 0;
        for (Map.Entry<Character, Integer> entry: data.entrySet()) {
            int cnt = entry.getValue();
            if (cnt % 2 == 0) {
                ans += cnt;
            } else {
                ans += cnt - 1;
                odd = 1;
            }
        }
        return ans + odd;
    }

	public static void main(String[] args) {
		LongestPalindromic obj = new LongestPalindromic();
		int res = obj.longestPalindrome("abccccdd");
		System.out.println(res);
	}

}

