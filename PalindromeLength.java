// Time Complexity : A for loop runs the length of the array - O(n) || All other Hashset operations are O(1) || Total Asymtotic Time Complexity - O(n) 
// Space Complexity : O(1). Because hashset in the worst case can have no more than 26 elements (26 letters of the alphabets)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

import java.util.*;
import java.lang.String;
class PalindromeLength {
    public int longestPalindrome(String s) {  
        if(s == null || s.length() == 0) return 0;  //edge case when string is empty
        HashSet<Character> cset = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(cset.contains(c))
            {   //if hashset contains the alphabet, remove it from hashset and increment count by 2 
                cset.remove(c);
                count+=2;
            }
            else{  //if not then add element to hashset
                cset.add(c);
            }
        }
         if(!cset.isEmpty()) return ++count;   //if hashset is not empty, then selecting any one element makes a palindrome
         return count;  //if hashset is empty, return whatever is in count
    }
}

//Main class

class Main
{
    public static void main(String[] args)
    {
    PalindromeLength obj = new PalindromeLength();
    String input = "abccccdd";
    System.out.print("String " + input + " has longest palindrome with length "  + obj.longestPalindrome(input) + "\n");
    }
}