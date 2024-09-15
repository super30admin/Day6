// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class Longest_Palindrome {
	public static int longestPalindrome(String s) {
		/* Assigning an int array of 128 size to store upper and lower characters */
		int char_count[] = new int[128];
		/*
		 * We loop through the string, convert into char and access the ASCII value of
		 * char at that particular index in the int array, and in this way we are able
		 * to get the count of each character in the string For example : if we
		 * encounter a character 'a', since the ASCII value of 'a' is 97, we access the
		 * int array at index 97, and increment it by 1, in this way we are able to get
		 * the count of each character in the string
		 */
		for (char c : s.toCharArray()) {
			char_count[c]++;
		}
		/*
		 * We loop through the int array we initially created and check if each
		 * character count in array is an even or odd number and accordingly we get rid
		 * of an extra character if we encounter an odd number except for the first
		 * time, as this character would form the middle of the palindrome
		 */
		int result = 0;
		for (int count : char_count) {
			result = result + (count / 2) * 2;
			if (result % 2 == 0 && count % 2 == 1) {
				result = result + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "abccccdd";
		int longest_palindrome = longestPalindrome(s);
		System.out.println(s);
		System.out.println("Longest Palindrome : " + longest_palindrome);
	}
}