// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
public:
    unordered_set<char> palindromeSet;
    int longestPalindrome(string s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (palindromeSet.find(s[i]) == palindromeSet.end()) 
            {
                palindromeSet.insert(s[i]);
            }
            else 
            {
                palindromeSet.erase(s[i]);
                count += 2;
            }
        }
        
        if(palindromeSet.size() >= 1) return count + 1;
        return count;
    }
};
