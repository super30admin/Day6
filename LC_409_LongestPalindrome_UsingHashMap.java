// Time Complexity :O(n)- Need to traverse entire string
// Space Complexity :worst case: O(52) if the string contains all the non-repeating characters 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
import java.util.*;

class Solution {
    public static int longestPalindrome(String s) {
    	
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        //Variable to store the length of palindrome string
        int length =0 ; 
        //variable to check the odd number of characters that could be placed in the middle
        boolean odd= false;
        //iterate over entire string char by char
        //Insert the values in map and if repeated increment the value corresponding to the key in map
        for(char c: s.toCharArray()){
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c)+1 );
        }
        //calculate the length of palindrome string based on the value's stored in map
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() % 2 != 0) 
            {
                odd = true;
                if(entry.getValue()/2 >= 1) length +=entry.getValue()-1;
            }
            else length +=entry.getValue();
        }
        
        if(odd == true) return length+1;
        else return length;
        
    }
    public static void main(String[] args) {
    		String input ="aabbdcdcce";
    		System.out.println("Maximum length of Palindrome String: " + longestPalindrome(input));
    }
}