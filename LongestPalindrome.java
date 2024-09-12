import java.util.HashSet;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return -1;
		int count = 0;
		HashSet<Character> set = new HashSet();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
			} else {
				count += 2;
				set.remove(ch);

			}
		}
		if (!set.isEmpty())
			count++;

		return count;
	}
}
