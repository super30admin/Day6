/*
    1. Time Complexity : O(n)
    2. Space Complexity : O(1)   
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * Check if char at index i is present in hashset
 * If yes, then the char was seen before. So remove this entry from hashset and increment count by 2(because this is the second entry of the same char)
 * if no, then add char to the set. This implies that this was either first or odd number occurance of the char.
 */
import java.util.HashSet;
class Solution {
    public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        char c;
        for(int i=0; i <s.length(); ++i) {
            c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
                count+=2;
            } else {
                set.add(c);
            }
        }
        return (!set.isEmpty()) ? count + 1: count;
    }
    public static void main(String[] args) {
        String s = "abccccddaedaada";
        System.out.println("Maximum length of a palidrome from string " + s + " is: " + longestPalindrome(s));
    }
}