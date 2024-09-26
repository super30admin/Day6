/*
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s is None or len(s) == 0:
            return 0
        
        count = 0
        charSet = set()
        
        for char in s:
            if char in charSet:
                count += 2
                charSet.remove(char)
            else:
                charSet.add(char)
        
        if len(charSet) != 0:
            count += 1
            
        return count

*/

// Time Complexity : O(n) where n is size of string
// Space Complexity : O(1) as alphabets are 26 only
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Everytime a character is encountered I put in set and when next
// time it appeared I remove it from set and added 2 to count. If at last set contains element then add 1

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        int count = 0;
        HashSet<Character> charSet = new HashSet<>();
        
        for (int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if (charSet.contains(currentChar)){
                count += 2;
                charSet.remove(currentChar);
            }else{
                charSet.add(currentChar);
            }
        }
        
        if (charSet.size() != 0)
            count ++;
        
        return count;
    }
}