//https://leetcode.com/problems/longest-palindrome/
//easiest of the lot.

//T.C = O(n)
//S.C = O(n)

//get a counter, if count%2==0, add to ans straight away, get a odd flag, if count%2==1 && count>1, add count-1
//you can have 1 odd char, so keep track of it, that's something I'd need to keep in mind knowing me  
// I guess this is tad tricky to think of in interview, which is why it was given

class Solution {
public:
    int longestPalindrome(string s) {
        int count = 0; bool odd = false;
        unordered_map<char, int> um;
        for (auto c : s) um[c]++;   
        for (auto c : um) {
            if (c.second % 2 == 0) count += c.second;
            else {
                if(!odd) {
                    count += c.second;
                    odd = true;
                }
                else count += c.second-1;
            }
        }
        return count;
    }
    
};