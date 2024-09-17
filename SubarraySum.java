// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            int sum = 0;
           
            for(int j= i; j<nums.length; j++) {
                 
                sum += nums[j];
                
                if(sum == k) {
                    count++;
                }
                
            }
        }
        
        return count;
        
    }
}