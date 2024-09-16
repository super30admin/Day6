
// TC: O(N) where N represents the number of elements in the array ad since we are traversing and check each element in the array.
// SC : O(N) where N is used to store N elements where each element can be unique

// We are using Hashset where if we already find a character, we will remove it from string so that we know that the character is repeated in multiples of 2
// or not. if it is even number, we know that the characters in set will be 0. So, we will add and remove to check if the characters are even or not. 
// Once we are out of loop, we check for set size to know how many elements which have 1/odd count are remaining in the Set.
// If we have odd numbers in the array, we will subtract 1 from it to make it even and subtract it from the string length so that we can form a palindrome

import java.util.HashSet;

public class longest_palindrome {

	public int LongestPalindrome(String s) {
		
		HashSet<Character> set = new HashSet();
		
		for(char c: s.toCharArray()) {
			if(set.contains(c))
				set.remove(c);
			else 
				set.add(c);
		}
		
		int odd = set.size();
		return s.length() - (odd==0? 0: odd-1);
	}
	public static void main(String[] args) {
		
		longest_palindrome lp = new longest_palindrome();
		System.out.println(lp.LongestPalindrome("ccddddxyz"));
	}
}
