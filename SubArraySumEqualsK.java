/**
TC - O(n)
SC - O(n)
**/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int totalSubArrayIsK = 0;
        
        Map<Integer, Integer> prefixToFreq = new HashMap<>();
        
        int prefixSum = 0;
        int remainingSumToK = 0;
        
        for (int i =0; i<nums.length; i++)
        {
             remainingSumToK = prefixSum - k;
            
             if (prefixToFreq.containsKey(remainingSumToK))
             {
                 totalSubArrayIsK += prefixToFreq.get(remainingSumToK);
             }
             
             prefixToFreq.put(prefixSum, prefixToFreq.getOrDefault(prefixSum,0) + 1);
            
            prefixSum += nums[i];
        }
        
        
             remainingSumToK = prefixSum - k;
            
             if (prefixToFreq.containsKey(remainingSumToK))
             {
                 totalSubArrayIsK += prefixToFreq.get(remainingSumToK);
             }
        
        return totalSubArrayIsK;
    }
}