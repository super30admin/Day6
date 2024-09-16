// Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int rSum = 0;
        int count = 0;
        unordered_map<int, int> hmap;
        for(int i=0;i<nums.size();i++){
            rSum += nums[i];
            if(rSum == k){
                count++;
            }
            if(hmap.find(rSum - k) != hmap.end()){
                count+=hmap[rSum - k];
            }
            hmap[rSum]++;
            
               
        }
        return count;
    }
};