// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int longestPalindrome(String s) {
        int once = 0, atLeastTwice = 0;
        Map<Character,Integer> m = new HashMap<>();
        
        for(char c: s.toCharArray()){				// traverse through all the elements
            m.put(c, m.getOrDefault(c, 0)+1);		// fill the map with default value - 0 + 1
        }
        
        for(char c: m.keySet()){					// following the logic of finding the odd and even occurrence of the character, count the occurrences  
            atLeastTwice += (m.get(c) /2);
            once += (m.get(c) % 2);
        }
        
        return (atLeastTwice * 2) + (once > 0 ? 1 : 0);		// return the maximum length of the palindrome 
        
    }
}