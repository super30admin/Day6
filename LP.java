//Time Complexity : O(n)
//Space Complexity: O(1)
//Code run successfully on LeetCode.

import java.util.HashMap;

public class LP {
	
	 public int longestPalindrome(String s) {
		 
		 HashMap<Character, Integer> map = new HashMap<>();
		 char c;
		 int val;
		 int max = 0;
		 
		 for(int i =0; i < s.length(); i++) {
			 c = s.charAt(i);
			 if(map.containsKey(c)) {
				val = map.get(c);
				val = val +1;
				if(val % 2 == 0)
					max += val;
				
				map.remove(c);	
			 }
             
             else
			    map.put(c, 1);
		 }
		 
		 if(!map.isEmpty())
			 max += 1;
	        
		 return max;
	    }

}
