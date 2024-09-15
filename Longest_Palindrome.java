//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

import java.util.*;
class Longest_Palindrome {
    public int longestPalindrome(String s) {
    	
    	if(s == null || s.length() == 0)
    		return -1;
    	int count = 0;
    	Set<Character> set = new HashSet<>();
    	for(int i = 0; i < s.length(); i++)
    	{
    		char ch = s.charAt(i);
    		if(set.contains(ch))
    		{
    			count += 2;
    			set.remove(ch);
    		}
    		else
    			set.add(ch);
    	}
    	if(!set.isEmpty())
    		return count+1;
    	return count;
    }
    
    public static void main(String[] args)
    {
    	String s = "adbbbccccd";
    	Longest_Palindrome lp = new Longest_Palindrome();
    	System.out.println(lp.longestPalindrome(s));
    }
}
