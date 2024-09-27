// Time Complexity : O(N)
// Space Complexity :O(52) or O(1) The string can have atmost 52 characters.
// Did this code successfully run on Leetcode :YEs
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return 0;
        // 1
        // Consider a HashMap that maps the charater to the no of occurences o the
        // character
        HashMap<Character, Integer> map = new HashMap<>();

        int length = 0;

        for (char c : s.toCharArray()) {
            // 2
            // Is the map contains the character then increment the value;
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                // 3
                // If you have encountered it for the first time then map to 1.
                map.put(c, 1);
            }
        }

        // 4
        // Consider the map values and traverse through map values
        for (Integer num : map.values()) {
            // 5
            // If any valus is even then add it to the length;
            if (num % 2 == 0) {
                length += num;

            } else {
                // 6
                // If it is an odd number then for eg num = 3 then consider two values of it
                // (3/2) * 2 = 2
                length += (num / 2) * 2;

            }
        }
        // 7
        // If the length of the string is equal to the palindrome string then return the
        // length;
        if (s.length() == length)
            return length;
        else
            // If it is not equal then we have collected the even values leaving one
            // character so we add that and return it
            return length + 1;

    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        String s = "aaabccccdd";
        int longest = obj.longestPalindrome(s);
        System.out.println(longest);
    }
}