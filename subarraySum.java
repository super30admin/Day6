// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        // return 0 if array is null or its length is zero
        if(nums == null || nums.length ==0) return 0;
        // initalize count and running sum
        int rSum = 0;
        int count = 0;
        // create a hashmap to store running sum along with its count
        HashMap<Integer, Integer> map = new HashMap<>();
        // store 0 and its count 1 to not miss the initial subarray
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            // calculate the running sum for every element of the array
            rSum += nums[i];
            if(map.containsKey(rSum - k)){
                // if hashmap contains the difference of running sum and k,
                // then increase the count by the number of times difference of running sum and k has occurred
                count += map.get(rSum - k);
            }
            if(map.containsKey(rSum)){
                // if hashmap already has the running sum as key, increment its count by 1
                map.put(rSum, map.get(rSum) + 1);
            } else {
                // if hashmap does not have the running sum as key, insert it with count 1
                map.put(rSum, 1);
            }
        }
        return count;
    }
}