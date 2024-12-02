// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    unordered_map<int, int> rSumMap; // Map saving rSum with number of occurrences
    int subarraySum(vector<int>& nums, int k) {
        int rSum = 0;
        int subArrayCount = 0;
        
        rSumMap[0] = 1; // while tracing the complementary number this entry is to detect when k appears and complementary number = 0
        for (int i = 0; i < nums.size(); i++)
        {
            rSum = rSum + nums[i];
            int complementaryVal = rSum - k;
            if(rSumMap.find(complementaryVal) != rSumMap.end())
            {
                subArrayCount += rSumMap[complementaryVal];
            }
            
            //adding the new rSum to map
            if (rSumMap.find(rSum) == rSumMap.end()) rSumMap[rSum] = 1;
            else rSumMap[rSum]++;
        }
        
        return subArrayCount;
    }
};
