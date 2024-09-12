/*
Author: Akhilesh Borgaonkar
Problem: Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
Approach: Using hashset here to store the characters in the string. If a character is already in the hash set then, remove it and increment 
    the cumulative counter by 2 which counts even occurences of a character. Get the total number of even occurences and then if there is still
    a character remaining in the hashset then add 1 to the counter as that odd occurence char can be the middle element in pallindrome.
Time Complexity: O(n) where n is length of string.
Space complexity: O(1) constant.
LC Verified.
*/

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                maxLen+=2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty())
            maxLen++;
        return maxLen;
    }
}