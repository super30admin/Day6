// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution
{
public:
    int longestPalindrome(string s)
    {
        if (s.size() == 0)
        {
            return 0;
        }

        int cnt = 0;
        set<char> storeSet;

        for (int i = 0; i < s.size(); i++)
        {
            if (storeSet.find(s[i]) != storeSet.end())
            {
                cnt += 2;
                storeSet.erase(s[i]);
            }
            else
            {
                storeSet.insert(s[i]);
            }
        }

        if (!storeSet.empty())
        {
            cnt += 1;
        }

        return cnt;
    }
};