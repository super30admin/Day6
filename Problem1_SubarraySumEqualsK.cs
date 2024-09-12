// Time Complexity : O(n) where n is the size of the array nums
// Space Complexity: O(n)
public class Solution {
    public int SubarraySum(int[] nums, int k) {
        Dictionary<int, int> prefixSumFreq = new Dictionary<int, int>();
        
        prefixSumFreq.Add(0,1);
        int prefixSum = 0, combinations = 0;
        
        for(int i=0; i<nums.Length; i++){
            prefixSum += nums[i];
            int excess = prefixSum - k;
            
            if(prefixSumFreq.ContainsKey(excess))
                combinations += prefixSumFreq[excess];
            
            if(prefixSumFreq.ContainsKey(prefixSum))
                prefixSumFreq[prefixSum]+=1;
            else
                prefixSumFreq.Add(prefixSum, 1);
        }
        
        return combinations;
    }
}