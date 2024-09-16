import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest_Palindrome {
	//Approach: 1. While we are iterating the string, we are storing the first occurrence of a character in set, 
	//if it appears again we increase the count and remove the element from set, indicating we got a pair to form a palindrome.
	//2. Finally if the set is not empty, we can still add one more character to form an odd length palindrome and increase the count accordingly and return it.
	public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>(52);
        int count = 0;
        for(int loop = 0;loop< s.length(); loop++)
        {
            if(set.contains(s.charAt(loop)))
            {
                count +=2;
                set.remove(s.charAt(loop));
            }else
                set.add(s.charAt(loop));
        }
        if(!set.isEmpty())
            count++;
        return count;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
