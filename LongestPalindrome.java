// Time Complexity : O(N) where N is length of the string
// Space Complexity : O(N) to store intermediate characters in hashSet
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : not really

import java.util.*;

class LongestPalindrome {

    public int findLongestPalLen(String s) {

        //create a set to store characs that we have encountered once so far
        Set<Character> singles = new HashSet<>();
        int len = 0;

        for(Character chr : s.toCharArray()) {
            if(singles.remove(chr)) {
                //if remove is successful means this is the second occurence of the character
                //increase possible pallindrome length by 2
                len += 2;
            } else {
                //its not present, add it to the hashSet and wait for second occurrence of this character
                singles.add(chr);
            }
        }
        
        //if hashSet is not empty, we can use one character as center of our palindrome
        //return len + 1 else return len
        return singles.size() > 0 ? len + 1 : len;
    }

    public static void main(String[] args) {
        String checkPal = "abccccd";

        LongestPalindrome lp = new LongestPalindrome();

        System.out.println(lp.findLongestPalLen(checkPal));
    }
}