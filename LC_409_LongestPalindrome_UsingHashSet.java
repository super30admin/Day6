// Time Complexity :O(n)- Need to traverse entire string
// Space Complexity :worst case: O(52) if the string contains all the non-repeating characters 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
import java.util.*;

class Solution2 {
    public static int longestPalindrome(String s) {
    	
    	 HashSet<Character> set = new HashSet<Character>();
         int count=0;
         //If Hashset contains the character, means pair found to create palindrome string
         //Increment the count by 2 & remove the char from the set
         for(char c: s.toCharArray()){
             if(set.contains(c)){
                 count= count+2;
                 set.remove(c);
             }else{
                 set.add(c);
             }
         }
         //If the set is empty, just return the count 
         //Else any character in the set could be placed in the middle,hence increment the count by 1
         if(set.isEmpty()) 
             return count;
         else
             return count+1;
    }
    public static void main(String[] args) {
    		String input ="aabbdcdcce";
    		System.out.println("Maximum length of Palindrome String: " + longestPalindrome(input));
    }
}