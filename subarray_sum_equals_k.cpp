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
    int subarraySum(vector<int>& nums, int k) {
        int count = 0;

        unordered_map<int, int> sum_count_map;

        int running_sum = 0;
        sum_count_map[running_sum] = 1;
        for(int num : nums)
        {   
            running_sum += num;
            if(sum_count_map.contains(running_sum - k) == true)
            {
                count += sum_count_map[running_sum - k];
            }
            
            sum_count_map[running_sum]++;

        }
        return count;
    }
};