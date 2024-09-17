import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// Time Complexity : O(n)
// Space Complexity : O(1) since Map can contain 52 characters (a-z A-Z) which is a constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
Even length palindrome have all the characters in pairs abba
Odd length palindromes have all the characteras in pairs + 1 character at the middle
 Approach 1: (2 pass)
1. we can count frequency of each character and save in a map
2. all character with frequencies greater than 1 can be taken to form a palindrome. if any character is left after taking the pairs can be left to form odd length palindrome
 
Approach 2: (1 pass)
1. If a character is already present in the set, it is removed to make a pair else added to the set.
2. At the end if there are any elements left in the set, we can form a odd length palindrome else a even length palindrome.


*/

public class LongestPalindrome {
    public int longestPalindrome1(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
            
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>1)
            {
                count+=map.get(s.charAt(i))-map.get(s.charAt(i))%2;
                if(map.get(s.charAt(i))%2!=0)
                map.put(s.charAt(i),map.get(s.charAt(i))%2);
                else map.remove(s.charAt(i));
            }
            
        }
        
        return (map.size()>0)?count+1:count;
        
        
    }
    public int longestPalindrome2(String s) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
           if(set.contains(s.charAt(i)))
           {
               set.remove(s.charAt(i));
               count+=2;

           }
           else set.add(s.charAt(i));
            
            
        }

        return set.size()>0?count+1:count;
    }

    public static void main(String[] args)
    {
        String s= "abccccdd";
        LongestPalindrome obj=new LongestPalindrome();
       System.out.println(obj.longestPalindrome2(s));
    }
}