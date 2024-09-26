/*
 *  Time Complexity: O(N) We are iterating over each character in the string.
 *  Space Complexity: O(1) Considering the fact that we have only lower/Upper case english letters we only store constant length of values in set.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  We would iterate over each character in string. If this character already exists in the set we remove it from the set and add 2 to the length of longest palindrome. If the character dosent exist we simply add it to the set. In the end we return the longest palindrome length. 
 */

class Solution {
    public int longestPalindrome(String s) {
        int palindromeLength = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                palindromeLength+=2;
                set.remove(ch);
            }
            else{
              set.add(ch);  
            } 
        }
         return set.size()!=0 ? palindromeLength+1:palindromeLength;
    }
}
