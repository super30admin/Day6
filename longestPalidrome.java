// Time complexiy is O(n) as we are iterating through the length of the string
// space complexity is O(1) as we are storing max of 26 character only
// the below solution is passed on leetcode
import java.util.HashSet;
public class longestPalidrome {
	public int longestPalindrome(String s) {
		//edge
		if (s.length()== 0 || s == null) {
			return -1;
		}
		HashSet<Character> hash = new HashSet<>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!hash.contains(c)) {
				hash.add(c);
			}
			else {
				hash.remove(c);
				count +=2;
			}
		}
		if(hash.isEmpty()) {
			return count;
		}
		else {
			return ++count;
		}	
	}
	public static void main(String[] args) {
		longestPalidrome pal = new longestPalidrome();
		String s = "abccccdd";
		int result = pal.longestPalindrome(s);
		System.out.println(result);
	}

}
