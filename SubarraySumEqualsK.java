// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// 1. Same as Contiguous Array. We have a target k, in place of 0 there. So every time we iterate, we check if we have (cumulative sum - k) present in the hashmap,
// if so, which means that between these two elements we have a sub array with cumulative sum = (C - (C-K)) = K.

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
             if(map.containsKey(currentSum-k)){
                count += map.get(currentSum-k);
            }
            if(map.containsKey(currentSum)){
                map.put(currentSum, map.get(currentSum)+1);
            }
            else{
                map.put(currentSum, 1);
            }
        }
        return count;
    }
}
