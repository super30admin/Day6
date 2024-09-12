package com.ds.rani.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note: Assume the length of given string will not exceed 1,010.
 * Example:
 * Input:
 * "abccccdd"
 * Output:
 * 7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

    //Time complexity o(n)
    //Space complexity o(1)
    /**
     *
     * @param s
     * @return
     */
    public static int longestPalindromeStr(String s) {
        if(s == null || s.length()==0)
            return -1;
        int count=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                count = count +2;
                set.remove(s.charAt(i));
            }
        }
        if(!set.isEmpty())
            count++;
        return count;
    }

    public static void main(String[] args) {
        String str="abccccdd";
        System.out.println(LongestPalindrome.longestPalindromeStr(str));
    }
}
