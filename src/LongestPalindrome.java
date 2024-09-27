import java.util.HashSet;

public class LongestPalindrome {

	public int longestPalindrome(String s) {

		HashSet<Character> charIn = new HashSet<>();
		int count = 0;

		for (char c : s.toCharArray()) {

			if (charIn.contains(c)) {
				count += 2;
				charIn.remove(c);

			} else {

				charIn.add(c);
			}
		}

		return charIn.size() != 0 ? count + 1 : count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindrome objIn = new LongestPalindrome();

		System.out.println(objIn.longestPalindrome("abccccdd"));

	}

}
