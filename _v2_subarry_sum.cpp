// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        unordered_map<int, int> sum_map;
        
        int sum = 0;
        int total_count = 0;
        int i = 0;
        int temp;
        
        // Add 0 sum
        sum_map.insert(pair<int, int>(0, 1));
        
        for(i = 0; i < nums.size(); i++)
        {
            temp = nums[i];
            
            sum += temp;

            // Check if difference with k available    
            if(sum_map.find(sum - k) != sum_map.end())
            {
                total_count += sum_map[sum-k];
            }
            
            // New Sum condition
            if(sum_map.find(sum) == sum_map.end())
            {
                sum_map.insert(pair<int,int>(sum, 1));
            }
            // Already present sum
            else
            {
                sum_map[sum]++;
            }
        }
        
        return total_count;
    }
};