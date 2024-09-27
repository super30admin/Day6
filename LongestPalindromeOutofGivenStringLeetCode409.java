//Time Complexity O(N) where N is the length of the String
//Space Complexity O(1) //we use a extra hashset but the max elements there will be 128 which is a very small constant
//Leetcode : yes
import java.util.HashSet;

public class LongestPalindromeOutofGivenStringLeetCode409 {
    public int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> set = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                length +=2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        //if the length is equal to string length then we can say the entire string can be a palindrome
        if (s.length() == length) {
            return length;
        } else {
            //if the length is not equal then it will whatever length we have calculated + 1 for center elemet ..ex string is aadefg.  here biggest palindrome can be ada or aea or afa or aga
            return length + 1;
        }
    }
}
