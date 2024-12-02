// Time Complexity : O(n)  n=number of characters in input string
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char temp:arr)
        {
        	if(map.containsKey(temp))
        	{
        		count+=2;
        		map.remove(temp);
        	}
        	else
        	{
        		map.put(temp, 1);
        	}
        }
        if(!map.isEmpty())
        {
        	count++;
        }
        return count;
    }
 
}