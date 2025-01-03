// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution
{
public:
    int findMaxLength(vector<int> &nums)
    {
        if (nums.empty())
        {
            return 0;
        }
        int res = 0;
        unordered_map<int, int> storeMap;
        int start = 0;

        storeMap[0] = -1;

        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] == 0)
            {
                start -= 1;
                if (storeMap.find(start) == storeMap.end())
                {
                    storeMap[start] = i;
                }
                else
                {
                    int t = i - storeMap[start];
                    if (t > res)
                    {
                        res = t;
                    }
                }
            }
            else
            {
                start += 1;
                if (storeMap.find(start) == storeMap.end())
                {
                    storeMap[start] = i;
                }
                else
                {
                    int t = i - storeMap[start];
                    if (t > res)
                    {
                        res = t;
                    }
                }
            }
        }
        return res;
    }
};