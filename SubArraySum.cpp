/*
This approach finds the total subarrays by consecutively adding elements,
and comparing it to the sum k. It does this by adding at each step and
keeping a count of the current number of matching sums.

Problems with this code: Time Limit exceeded on Leetcode

Did this code run on Leetcode: Yes
*/



class Solution {
public:
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    int subarraySum(vector<int>& nums, int k) {
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < nums.size(); i++)
        {   //Adding the current element to the current consecutive sum
            sum += nums[i];
            if(sum == k)
            {   //If match is found, we increase the count, and reset sum to 0.
                count++;
                sum = 0;
                //We also decrement i by 1, so that we can start computing the sum again from the current location.
                i--;
            }
            //If the sum exceeds the value of k then we reset the sum to 0 and start again from current location.
            else if(sum > k)
            {   
                sum = 0;
                i--;
            }
        }
        
        return count;
    }
};