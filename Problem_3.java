import java.util.HashMap;

// Time Complexity : O(n) where n = size of array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

public class Problem_3 {
	
	public int longestPalindrome(String s) {
	       
	    HashMap<Character, Integer> map = new HashMap<>();
	    int len = 0; 
	    for(int i = 0; i <s.length(); i++){
	        char c = s.charAt(i);
	        if(!map.containsKey(c)){
	            map.put(c,1);
	        }else{
	            map.remove(c);
	            len += 2;
	        }
	    }
	    return map.isEmpty() ? len : len + 1;
	}
}
