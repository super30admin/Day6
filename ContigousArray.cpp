// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// This problem is implemented using running sum approach.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int> map;
        map[0] = -1;
        int length = 0,sum = 0;

        for(int i=0;i<nums.size();i++)
        {
            sum = nums[i]?sum + 1:sum -1;
            if(map.find(sum)!=map.end())
            {
                length = max(length, i - map[sum]);
            }
            else
                map[sum] = i;
        }
        return length;


    }
};
