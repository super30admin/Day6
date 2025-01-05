// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 560. Subarray Sum Equals K
// Approach: Using Map and Running Sum
// Time Complexity: O(n)

class Solution
{
public:
    int subarraySum(vector<int> &nums, int k)
    {
        // Base Case
        if (nums.empty() || nums.size() == 0)
        {
            return 0;
        }

        unordered_map<int, int> mp;
        int count = 0, rSum = 0;
        mp[0] = 1;

        for (int i = 0; i < nums.size(); i++)
        {
            // Calculate running sum
            rSum = rSum + nums[i];

            // Calculate the difference between running sum and the target
            int diff = rSum - k;

            // Look if difference has ever occured, if yes increase the counter
            if (mp.find(diff) != mp.end())
            {
                count = count + mp[diff];
            }

            // Add the running sum to the map
            mp[rSum]++;
        }

        return count;
    }
};