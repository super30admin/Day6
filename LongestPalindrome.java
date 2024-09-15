package Hashing2;
//Time Complexity : o(n)
//Space Complexity :o(1) 26/52 chars
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

//Your code here along with comments explaining your approach
// We can use a hashmap and count the occurances of each character and take all elements with count 2 and any one elem with 1
// using Hashset, we can put in all elements and when there is duplicate increase count by 2 and remove the element
// at the end, if set is not empty just increase count by 1 and return count

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "abccccdd";
    int count = findLongestPalindromeCount(s);
    
    System.out.println(count);
	}
	
	public static int findLongestPalindromeCount(String s) {
		
		int count = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
			}
			else {
				set.remove(c);
				count+=2;
			}
		}
		
		if(!set.isEmpty()) {
			count+=1;
		}
		else {
			return count;
		}
		
		return count;
		
	}

}
