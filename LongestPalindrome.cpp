// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> set;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(set.find(s[i])!=set.end())
            {
                set.erase(s[i]);
                count = count + 2;
            }
            else
            {
                set.insert(s[i]);
            }
        }
        if(!set.empty())
        {
            count = count +1;
        }
        return count;
    }
};
