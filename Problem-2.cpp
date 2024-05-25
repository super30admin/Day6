// Time Complexity : O(n) since all the lookups and inserts to hash map are constant
// Space Complexity : O(n) worst case, if all the array only have 1s or only 0s
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int max = 0;
        int rsum = 0;
        unordered_map<int,int> rsum_idx_map;
        rsum_idx_map.insert(make_pair(0, -1));
        for(int i=0;i<nums.size();i++)
        {
            rsum = (nums[i]==1)? (rsum+1):(rsum-1);
            if(rsum_idx_map.find(rsum)!=rsum_idx_map.end())
            {
                int prev_rsum_loc = rsum_idx_map[rsum];
                if (max < i-prev_rsum_loc)
                {
                    max = i-prev_rsum_loc;
                }
            }
            else {
                rsum_idx_map.insert(make_pair(rsum, i));
            }
        }
        return max;
    }
};