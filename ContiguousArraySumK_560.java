// Time Complexity : O(N) 
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : wondered why we need to store (0,1) initially in the map. Is my explanation below correct?

// ============================= Approach-1 ==================================
/*
Algorithm:
=========
1. Store sum in array so far and number of times sum occurred in a hash map.
2. If a complement of k (sum - k) exists in map already, add number of times it occurred in the array to count
3. Update map's value where sum is key.
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        int count = 0, sum = 0; 
        Map<Integer, Integer> map = new HashMap<>();
        // Reason for storing 0, 1 initially in the map is, if complement is 0, implies the sum is k itself and that should be counted as well
        map.put(0, 1); //(sum, number of times sum occurred)
        
        for( int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int complement = sum - k;
            // If complement of k exists in the map, then add number of times it occurred to count
             if(map.containsKey(complement)) {
                 count += map.get(complement);
             }
            
            // Update sum count
            map.put(sum, map.getOrDefault( sum, 0) + 1);
        }
        return count;
    }
}


// ============================= Approach-2 ==================================

/*
Algorithm:
=========
1. Brute force technique where contiguous sum is calculated beginning with every element to check if sum equals k
2. O(N^2) time complexity
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0; 
        
        for(int start = 0; start < nums.length; start++) {
            int sum = 0; 
            for(int end = start; end < nums.length; end++ ) {
                sum += nums[end];
                if(sum == k) 
                    count++;
            }
        }
        return count;
    }
}
