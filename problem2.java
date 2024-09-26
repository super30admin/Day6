// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        int runSum = 0, maxLen = 0;
        
        //handling edge case
        sumMap.put(0, -1);
    
        for(int i=0; i<nums.length; i++){
            
            //calculating running sum
            runSum = (nums[i] == 0)? runSum-1: runSum+1;
            //check if the runSum exists or not
            if(!sumMap.containsKey(runSum)){
                sumMap.put(runSum, i);
            } else {
                //check if maxlen is less the new length
                maxLen = Math.max(maxLen,  i - sumMap.get(runSum));
            }
        }
        
        return maxLen;
    }
}