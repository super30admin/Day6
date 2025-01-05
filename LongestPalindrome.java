// Time Complexity : O (n)
// Space Complexity : O (n)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
 * If a character occurs twice, it will contribute 2 to the longest palindrome. Use a hashset to keep
 * track of such occurrences and remove on the second occurrence, incrementing lpSize by 2.
 * If there are any odd number of chars, they can be added to the middle (+1 size), and will be left over in the
 * hashset.
 */
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        int lpSize = 0;
        for (char c: s.toCharArray()) {
            if(charSet.contains(c)) {
                charSet.remove(c);
                lpSize += 2;
            }
            else charSet.add(c);
        }
        if (!charSet.isEmpty()) lpSize++;
        return lpSize;
    }
}