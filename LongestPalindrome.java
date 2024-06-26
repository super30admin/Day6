// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.*;
class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>(52);
        for(int i=0;i<s.length();i++){
            if(hmap.containsKey(s.charAt(i)))
                hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
            else
                hmap.put(s.charAt(i), 1);
        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry: hmap.entrySet()){
            if(entry.getValue() % 2 != 0)
                count++;
        }
       
        if(count == 0)
            return s.length();
        else
            return s.length() - count + 1;
        
    }
    public static void main(String[] args){
        System.out.println("Longest Palindrome ");
        String s = "abccccdd";
        LongestPalindrome obj = new LongestPalindrome();
        System.out.println(obj.longestPalindrome(s));
    }
}