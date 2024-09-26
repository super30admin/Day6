
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 
class Solution {
    public int longestPalindrome(String s) {
     
        int [] charMap = new int[128];
        for(char c : s.toCharArray())
        {
            charMap[c]++;
        }
        int length = 0;
        for(int i : charMap)
        {
            length += i/2 * 2;
            if(length%2==0 && i%2==1)
            {
                length+=1;
            }
        }
        return length;
    }
}