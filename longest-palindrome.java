// Time Complexity : O(n) {n = s.length()}
// Space Complexity : O(1) max size 52
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// find characters with odd frerquency. We can use at most one charater in odd numbers.

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[100];
        int oddCount = 0;
        for(int i = 0; i<s.length();i++){
            if(count[s.charAt(i)-'A']%2!=0) oddCount--;
            else oddCount++;
            count[s.charAt(i)-'A']++;
        }
        return oddCount>0 ? s.length()-oddCount+1 : s.length();
    }
}