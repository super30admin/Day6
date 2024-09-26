// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// This problem is implemented using running sum approach.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {

        if(nums.size()==0)
            return 0;
        unordered_map<int,int> map;
        int sum =0,count =0;
        map[0] = 1;

        for(int i=0;i<nums.size();i++)
        {
            sum = sum + nums[i];
            if(map.find(sum - k)!= map.end())
            {
                count = count + map[sum-k];
            }
            map[sum]++;
        }
        return count;

    }
};
