/**
Problem: Find the length of longest palindrome

Time Complexity: O(n), where n is the length of the string
Space Complexity: O(1), as the max number of unique characters that can be present in the hashset is 26.
Did this code successfully run on Leetcode : Yes

Approach : Use HashSet
1. If we encounter a new character from the string, add it to the hashset.
2. If we encounter a character that already exists, remove the character from the hashset, and add 2 to the length of the longest palindrome, because it forms a pair.
3. Finally, if we find that the hashset is not empty, we just add 1 to the length of the longest palindrome, because there is just one possibility of one character to be in the palindrome; 
either amidst the pair of characters, or, however, if all characters in the string are unique, then we just have 1 as the length of the longest palindrome that can exist.
*/

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int lenLongestPalindrome = 0;
        char[] charArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                lenLongestPalindrome += 2;
            }
            else
                hs.add(s.charAt(i));
        }
        if(!hs.isEmpty())
            lenLongestPalindrome += 1;
        return lenLongestPalindrome;
    }
}