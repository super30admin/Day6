// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : N/A


// Your code here along with comments explaining your approach

// Pattern used is - if we know total sum at any two points in an array 
// we can find the sum of all the elements between these 2 points (i.e. subarray)

// [a,b,c,d,e,f] = sum of subarray [c, d] = total sum at d - total sum at b


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int running_sum = 0;
        unordered_map<int, int> sum_early_index_map;
        sum_early_index_map[running_sum] = -1;

        int max_length = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            int add = (nums[i] == 0) ? -1 : 1;
            running_sum += add;
            if(sum_early_index_map.contains(running_sum) == true)
            {
                max_length = max(max_length, i - sum_early_index_map[running_sum]);
            }
            else
            {
                sum_early_index_map[running_sum] = i;
            }
        }
        return max_length;
    }
};