// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++) // Starting point of sub array
        {   
            int sum =0; // initialize sum for every start point 
            sum+=nums[i]; // adding start point to sum 
            if(sum==k) // if  value of start point itself is equal to k 
            {
                count++;
            }
            for(int j=i+1;j<nums.length;j++) // ending point of sub array
            {
                sum+=nums[j];
                if(sum==k) // whenever the sum is equal to k count that end point for the i th start point
                  count++;
            }
        }
        
        return count;
    }
}