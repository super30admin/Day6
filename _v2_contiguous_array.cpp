// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this -

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        int max_len = 0;
        
        unordered_map<int, int> sum_map;
        int sum = 0;
        int temp_len = 0;
        int i = 0;
        int temp;

        //Add 0 sum situation to set        
        sum_map.insert(pair<int, int>(0, -1));
        
        for(i = 0; i < nums.size(); i++)
        {
            temp = nums[i] == 1 ? 1 : -1;
    
            sum += temp;
            
            // New Sum condition
            if(sum_map.find(sum) == sum_map.end())
            {
                sum_map.insert(pair<int, int>(sum, i));
            }
            // Previously observed sum condition
            else
            {
                //Calculate distance between the indices
                temp_len = i - sum_map[sum];
                
                if(temp_len > max_len)
                {
                    max_len = temp_len;
                }
            }
            
        }
        
        return max_len;
    }
};