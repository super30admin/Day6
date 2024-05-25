// Time Complexity : O(n) since all the lookups and inserts to hash map are constant
// Space Complexity : O(n) since if all rsum's are unique this happens if array has only positive
//                    integers
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count = 0;
        int rsum = 0;
        unordered_map<int,int> sum_map;
        sum_map.insert(make_pair(0,1));
        for (int i=0;i<nums.size();i++)
        {
            rsum+=nums[i];
            if(sum_map.find(rsum-k)!=sum_map.end())
            {
                count=count+sum_map[rsum-k];
            }
            if(sum_map.find(rsum)!=sum_map.end())
            {
                sum_map[rsum] += 1;
            }
            else{
                sum_map.insert(make_pair(rsum, 1));
            }
        }
        return count;
    }
};