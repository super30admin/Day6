// Time Complexity : O(n*n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : No (Got Time limit Exceeded for last few cases)
// Any problem you faced while coding this - Couldn't come up with the Hashing approach solution

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        int len = nums.size();
        int sum = 0;
        int max_len = 0;
        int temp_len;
        int i, j;
        
        for(i = 0; i < len; i++)
        {
            sum = 0;
            for(j = i; j < len; j++)
            {
                sum += nums[j];
                
                temp_len = j-i+1;
                
                if( ((2*sum) == temp_len) && (temp_len > max_len) )
                {
                    cout << i << "  " << j << endl;
                    max_len = j-i+1;
                }
            }
        }
        
        return max_len;
    }
};