//https://leetcode.com/problems/longest-palindrome/
// Time Complexity : O(n) where n is the length of the input stirng
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// All the even occurances of characters can be considered
// Only upto one odd occurance can be take. If there are more then subtract it from the string length and return;
// Else just return the length of the string 
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> mp;
        int count=0;
        for(char it:s){
            mp[it]++;
            if(mp[it]%2 == 1){
                count++;
            }
            else{
                count--;
            }
        }
        if(count > 1) return s.size() - count + 1;
        return s.size();
    }
};