// Time Complexity : O(n*n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : No (Got Time limit Exceeded for last few cases)
// Any problem you faced while coding this - Couldn't come up with the Hashing approach solution

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        int total = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        
        int len = nums.size();
        
        while(i < len)
        {
            sum = 0;
            j = i;
            
            while(j < len)
            {
                sum += nums[j];
                
                if(sum == k)
                {
                    total++;
                }
                
                j++;
            }
            
            i++;
        }
        return total;
    }
};