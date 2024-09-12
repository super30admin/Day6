// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/* APPROACH:
use a hashmap to maintain the number of times a character has occured, get the max even ones and one extra odd.
*/

import java.util.HashSet;

public class longestPalindrome {

    public static int longestPalindrome(String s) {
        if(null == s || s.length() == 0) return -1;
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            } else {
                set.remove(s.charAt(i));
                length += 2;
            }
        }
        if(!set.isEmpty()) length++;
        return length;
    }

    public static void main(String[] args){
        String s1 = "abccccdd";
        System.out.println(longestPalindrome(s1)); //7

        String s2 = "a";
        System.out.println(longestPalindrome(s2)); //1

        String s3 = "bb";
        System.out.println(longestPalindrome(s3)); //2

    }
}
