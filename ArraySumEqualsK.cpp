// Time Complexity : O(N) where N is size of array
// Space Complexity : O(N) where N is the size of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Submission Link: https://leetcode.com/submissions/detail/530133986/

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int running_sum = 0;
        unordered_map<int, int> running_sum_count;
        int count = 0;
        
        running_sum_count[0] = 1;
        
        for(int num : nums){
            running_sum += num;
            count += running_sum_count[running_sum - k];
            running_sum_count[running_sum]++;
        }
        
        return count;
    }
};