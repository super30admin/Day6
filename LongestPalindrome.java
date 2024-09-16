// Time Complexity : O(N)
// Space Complexity : O(1) since maximum the hashset can contain is 26 characters irrespective of the input.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO 


// Your code here along with comments explaining your approach
// HashSet is used to store the newly encountered character.
// when a same character is found, we remove that from hashset and add +2 to count.
// If the hashset is not empty, we add +1 since either of the elements present in the hashset can be in the output palindrome sting.
// if the hashset is empty, we directly return the count.


import java.util.*;
public class LongestPalindrome {
    
    public static int longestPalindrome(String s) {
        
        if(s==null || s.length()==0)
        {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        
        int count = 0;
        
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(set.contains(c))
            {
                count+=2;
                set.remove(c);
            }
            else
            {
                set.add(c);
            }
        }
        
        if(!set.isEmpty())
        {
            return count +1;
        }
        else
        {
            return count;
        }
    }

    public static void main(String args[])
    {
        String s  ="abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
