import java.util.HashMap;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        //bases cases to check if the array is empty
        if(nums == null || nums.length == 0)
            return 0;
        
        int rSum = 0, result = 0;
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        freqMap.put(0, 1);
        
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            
            //if the map has running total - target sum, then we add the freq to the result
            if(freqMap.containsKey(rSum - k)){
                result += freqMap.get(rSum - k);
            }
            //we add the new running total and either if its new, we add 0 or we add 1 to the exisiting freq
            freqMap.put(rSum, freqMap.getOrDefault(rSum, 0) + 1);
        }
        
        return result;
        
    }
}