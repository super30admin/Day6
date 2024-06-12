/*

Brute force

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

*/

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        int _max = INT_MIN;
        
        
        for(int i =0; i< nums.size();i++) {
            int ones = 0;
            int zeros =0;
            if(nums[i] ==0) {
                zeros++;
            }else{
                ones++;
            }
            for(int j = i+1; j< nums.size();j++) {
                if(nums[j] == 1){
                    ones++;
                }else{
                    zeros++;
                }
                
                if(zeros == ones) {
                    _max = std::max (_max, j-i+1); 
                }
                
                
            }
        }
        
        if(_max == INT_MIN) return 0;
        return _max;
        
    }
};
