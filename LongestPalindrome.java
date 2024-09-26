/*
 * Time Complexity: O(L) - length of the string
 * Space complexity: O(26) = O(1) 
 * Ran successfully on LeetCode: Yes 
 */

import java.util.HashSet;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));        
    }
    
    public static int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                count += 2;   
                set.remove(s.charAt(i));                
            }
                
            else{
                set.add(s.charAt(i));
            }
        }
        
        if(set.size() != 0)
            count++;    
        
        return count;
    }    
}
