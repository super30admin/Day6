// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    unordered_map<int, int> rSumMap;// Map to save rSum and first index it appears
    // We need index of first occurrence since we are finding longest array
    int findMaxLength(vector<int>& nums) {
        int rSum = 0;
        rSumMap[0] = -1;
        int maxLen = 0;
            
        for (int i = 0; i< nums.size(); i++)
        {
            if(nums[i] == 0) rSum--;
            else rSum = rSum + nums[i];
            
            if(rSumMap.find(rSum) == rSumMap.end()) rSumMap[rSum] = i;
            else maxLen = max(maxLen, (i - rSumMap.at(rSum)));
        }
        return maxLen;
    }
};
