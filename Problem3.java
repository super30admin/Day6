import java.util.HashSet;
import java.util.Set;

// Time Complexity : O(n) ; where n is number of characters in string
// Space Complexity : O(n); worst case all chars in string are unique and set has to maintain them.
public class Problem3 {
	public int longestPalindrome(String s) {
		if(s==null || s.length()==0) return -1;
		
		Set<Character> set= new HashSet<>();		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(set.contains(c)) {
				count+=2;
				set.remove(c);
			}else {
				set.add(c);
			}
		}
		
		//If set is still having any character(s), we can add 1 as the palindrome can have only one char with frequency one.
		if(!set.isEmpty()) count++;
		
		return count;
	}

	public static void main(String[] args) {
		Problem3 obj= new Problem3();		
		System.out.println("Length of longest palindrome is: "+obj.longestPalindrome("abccccdd"));
	}

}
