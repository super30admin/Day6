// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {   
            int sum =0;
            sum+=nums[i];
            if(sum==k) 
            {
                count++;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==k)
                  count++;
            }
        }
        
        return count;
    }
}