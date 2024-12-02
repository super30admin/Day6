//Time Complexity : O(n)
//Space Complexity: O(1)
//Code run successfully on LeetCode.

import java.util.HashSet;

public class LP_1 {
	
	public int longestPalindrome(String s) {
		
		HashSet<Character> set = new HashSet<>();
		int max = 0;
		Character c;
		
		for(int i =0; i < s.length(); i++) {
			
			c = s.charAt(i);
			if(set.contains(c)) {
				
				max += 2;
				set.remove(c);
			}
			else
				set.add(c);
		}
		
		if(!set.isEmpty())
			max += 1;
		
		return max;
        
    }

}
