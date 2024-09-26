// Time Complexity : O(N) where N is size of array
// Space Complexity : O(N) where N is the size of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/contiguous-array/
// Submission Link: https://leetcode.com/submissions/detail/529649051/

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int sum = 0, max_len = 0;
        
        unordered_map<int, int> index_of_sum;
        
        for(int i = 0; i < nums.size(); i++){
            sum += (nums[i] == 0) ? -1 : 1;
            
            if(sum == 0)
                max_len = i + 1;
            else{
                if(index_of_sum.find(sum) == index_of_sum.end())
                    index_of_sum[sum] = i;
                else
                    max_len = max(i - index_of_sum[sum], max_len);
            }  
        }
        
        return max_len;
    }
};