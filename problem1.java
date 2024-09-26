// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        
        //running sum, frequency
        Map<Integer, Integer> sumMap = new HashMap<>();
        
        //Edge case
        sumMap.put(0,1);
        
        int runSum = 0, count = 0;
        
        for(int i=0; i<nums.length; i++){
            
            //calculating running sum
            runSum += nums[i];
            
            //calculating count if the complement exists
            if(sumMap.containsKey(runSum - k))
                count += sumMap.get(runSum-k);
            
            //updating map with new runSum / frequency
            sumMap.put(runSum, sumMap.getOrDefault(runSum,0)+1);
            
        }
        
        return count;
    }
}

