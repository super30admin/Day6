// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Maintain one hash map to store a running sum and its corresponding count.
 * Iterate over array while calculating the running sum and update answer by adding count of (current - k) key from map.  
 */

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        if (nums.size() == 0)
            return 0;
        
        int running_sum = 0;
        int ans = 0;
        
        // current_sum, count
        map<int, int> m;
        
        // Initialization 
        m.insert({0, 1});
        
        for (int i = 0; i < nums.size(); i++)
        {
            running_sum += nums[i];
            
            auto ele = m.find(running_sum - k);
            
            if (ele != m.end())
                ans += ele->second;
            ele = m.find(running_sum);
            
            if (ele != m.end())
            {
                ele->second++;
            }
            else
            {
                m.insert({running_sum, 1});
            }
        }
        return ans;
    }
};