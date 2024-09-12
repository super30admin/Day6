// Time Complexity : O(n)2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        for(int i = 0;i<nums.length ; i++)
        {
            int sum = nums[i];

            if(sum == k)
            {
                count++;
            }

            for(int j = i+1 ; j<nums.length ; j++)
            {
                sum = sum + nums[j];

                if(sum == k)
                {
                    count++;
                }
            }

        }

        return count;
    }
}
