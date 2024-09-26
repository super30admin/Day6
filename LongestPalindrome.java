package S30.Hashing_2;

// Time Complexity : O(n)
// Space Complexity : O(1) --> size set will be at most 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.HashSet;

public class LongestPalindrome {

    public int longestPalindrome(String s) {

        if(s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                maxLength +=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }

        if(set.size() > 0) maxLength +=1;
        return maxLength;
    }

    public static void main(String[] args) {
        LongestPalindrome testClass = new LongestPalindrome();
        System.out.println(testClass.longestPalindrome("abccccdd"));
    }


}
