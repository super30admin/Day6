// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> runningSum = new HashMap<>();
        runningSum.put(0, -1);
        int rSum = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) rSum++;
            else rSum--;
            
            if(runningSum.containsKey(rSum)) 
                max = Math.max(max, i - runningSum.get(rSum));
            else
                runningSum.put(rSum, i);
        }
        
        return max;
    }
}