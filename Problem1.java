// Time Complexity : O(n) because we are iterating through the array once
// Space Complexity : O(n) to store HashMap key value pair
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
           rSum = rSum + nums[i]; //continously add array value at index i to rSum as we iterate over the array
            if(map.containsKey(rSum-k)) // If we have seen this value that means we have a contiguos subarray that sums up to k 
            {
               count = count + map.get(rSum-k); //increase count of subarrays whose sum equals k that we have found till now
            }
          map.put(rSum,map.getOrDefault(rSum,0)+1); //Also add rSum as key and its occurance as value to the hashMap
        }
    return count;
    }
}
