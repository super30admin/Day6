// Time Complexity :O(N) 
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store the frequency of each prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0; // Variable to store the count of subarrays that sum to k
        int prefixSum = 0; // Variable to store the current prefix sum
        
        // Iterate through each number in the array
        for (int i : nums) {
            prefixSum += i; // Update the prefix sum with the current number
            
            // If the prefix sum is equal to k, increment the count
            if (prefixSum == k) count++;
            
            // If (prefixSum - k) exists in the map, it means there is a subarray that sums to k
            if (map.containsKey(prefixSum - k)) count += map.get(prefixSum - k);
            
            // Update the frequency of the current prefix sum in the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count; // Return the count of subarrays that sum to k
    }
}
