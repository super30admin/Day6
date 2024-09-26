// Time Complexity : O(N) where N is size of string
// Space Complexity : O(N) where N is the size of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/longest-palindrome/
// Submission Link: https://leetcode.com/submissions/detail/530125908/

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, bool> char_present;
        int count = 0;
        int oddCount = 0;
        
        for(char c : s){
            if(char_present[c]){
                char_present[c] = false;
                count += 2;
                oddCount--;
            }
            else{
                char_present[c] = true;
                oddCount++;
            }
        }
        
        if(oddCount > 0)
            count += 1;
        
        return count;
    }
};