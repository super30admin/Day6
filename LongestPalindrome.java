// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        int palindromeLength = 0;
        HashSet<Character> letters = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i ++){
            char currentCharacter = s.charAt(i);
            if(letters.contains(currentCharacter)) {
                letters.remove(currentCharacter);
                palindromeLength += 2;
            }
            else
                letters.add(currentCharacter);
        }
        
        if(!letters.isEmpty())
            palindromeLength++;
        return palindromeLength;
    }
}