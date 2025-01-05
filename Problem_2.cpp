// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 525. Contiguous Array
// Approach: Using running sum and hash map
// Time Complexity: O(n)

class Solution
{
public:
    int findMaxLength(vector<int> &nums)
    {
        // Check for base case, if an empty input vector is provided
        if (nums.empty() || nums.size() == 0)
        {
            return 0;
        }

        unordered_map<int, int> mp;
        int maxLen = 0;
        int sum = 0;

        mp[0] = -1;

        for (int i = 0; i < nums.size(); i++)
        {

            // Logic for running sum, subtract 1 if '0' is the element
            if (nums[i] == 0)
            {
                sum = sum - 1;
            }
            // Add 1 if '1' is the element
            else
            {
                sum = sum + 1;
            }

            // Check in the map if sum was ever occured, if not then add the sum to the map with value as index
            if (mp.find(sum) == mp.end())
            {
                mp[sum] = i;
            }

            // Compare current max length with the calculated length and store the maximum
            maxLen = max(maxLen, (i - mp[sum]));
        }

        return maxLen;
    }
};