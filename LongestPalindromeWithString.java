package HashFunction;

import java.util.HashSet;

/*
-------------------------------------------------------------------------------------------------------
Time complexity : o(n) - 
space complexity: o(1) --> o(1) the values in set takes up maximum space of 26 characters
Did this code run successfully in leetcode : yes
problems faces : no
create a set. first check if the character doesnt exist in set, then  add character to set. 
next time same character occurs check if that exists in set, then increase the count by 2 and remove the character from set.
at the end , if the set is not empty , you can increae the count by since we can keep single extra character in the middle of palindrome. 
*/
public class LongestPalindromeWithString {

    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                count += 2;
                set.remove(s.charAt(i));

            } else {
                set.add(s.charAt(i));
            }
        }

        if (!set.isEmpty()) {
            count++;
        }

        return count;
    }

}
