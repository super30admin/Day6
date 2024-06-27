import java.util.HashSet;

// Time Complexity : O(n) where n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
Any pairs of 2 characters can form a palindrome. Hence, when we iterate over the string, we check if the character at
a particular index has already been encountered earlier i.e., if it is already present in the hashset. If yes, remove
that character and increase the count by 2. If no, add this new character into the hashset until we encounter same key
again. At last if the hashset is not empty then that means there is at least one unique character still available which
can go in the middle of the palindrome, so we add 1 to the end result.
 */

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashSet<Character> hset = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++) { //O(n)
            char c = s.charAt(i);
            if(hset.contains(c)) { //O(1)
                count += 2;
                hset.remove(c);
            } else {
                hset.add(c);
            }
        }
        if(!hset.isEmpty()) count++;
        return count;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "nitin";
        System.out.println("Length of longest palindrome for " + s1 + " is " + longestPalindrome(s1));
        System.out.println("Length of longest palindrome for " + s2 + " is " + longestPalindrome(s2));
    }
}
