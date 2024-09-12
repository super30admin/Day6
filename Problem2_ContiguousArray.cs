// Approach: if we replace 0 with -1, this problem is similar to "Subarray Sum Equals K", with sum 0 and we need to find max length instead of freq

// Time Complexity : O(n) where n is the length of nums array
// Space Complexity: O(n)
public class Solution {
    public int FindMaxLength(int[] nums) {
        Dictionary<int, int> prefixSumMinIndex = new Dictionary<int, int>();
        prefixSumMinIndex.Add(0, -1);
        
        int prefixSum = 0, maxLen =0;
        
        for(int i =0; i<nums.Length; i++){
            int val  = nums[i] == 0 ? -1 : 1;
            
            prefixSum+= val;
            
            if(prefixSumMinIndex.ContainsKey(prefixSum))
                maxLen = Math.Max(maxLen, i-prefixSumMinIndex[prefixSum]);
            else
                prefixSumMinIndex.Add(prefixSum, i);
        }
        
        return maxLen;
    }
}