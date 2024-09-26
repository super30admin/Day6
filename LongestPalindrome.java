// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
// The idea is to keep a count of all the characters and add the even count of characters 
// if there are more than one single characters then there will be a difference in the count and the given string length
// so we add one to the result to consider one single character
class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1)
            return 1;
        
        int[] charCount = new int[128];
        for(char c:s.toCharArray()) {
            charCount[c-'A']++;
        }
        
        int result = 0;
        
        for(int i=0; i<128; i++) {
           result += charCount[i]/2 *2;
        }
        
        return s.length() == result ? result: result+1;
    }
}