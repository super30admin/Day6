/*
 * Time Complexity: O(n) - length of string
 * Space Complexity: O(n) - for HashSet
 */
package Super30;

import java.util.HashSet;

public class LongestPalindrom_LC409 {

	public static void main(String[] args) {
		System.out.println(longestPalindrom("abccccdd"));
	}
	
	public static int longestPalindrom(String s) {
		//Maintain a hashset of characters
		// if char is present, remove & +2 count
		// else add char
		int count = 0;
		
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(set.contains(c)) {
				count += 2;
				set.remove(c);
			}
			else
				set.add(c);		
		}
		
		//if our set still contains a char, increase count by e
		if(!set.isEmpty())
			count++;
		return count;
	}

}
