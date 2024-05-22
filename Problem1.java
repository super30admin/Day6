/*
    LC - 560. Subarray Sum Equals K
    TC - O(n)
    SC - O(n)
    Did this code successfully run on Leetcode : Yes
    Approach - Traverse the array, update the running sum & check if the rSum - k exist in hashmap, if exist, get the count value from the map and update the count.
        update the map with rSum and its respective value (1 if it is first occurence else sum it with 1)
        for edge base case, add (0, 1).

        Key Logic : Running Sum (sum of all the elements till that index)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int rSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++) {
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count = count + map.get(rSum - k);
            } 
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}