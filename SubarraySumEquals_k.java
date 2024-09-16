// Time Complexity : O(N) where N is the length of the nums array
// Space Complexity : O(N) N remains same for the worst case in the hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I couldn't come up with adding (0, 1) in the hashmap, I was adding (0) and using a hashset to find if the sum already exists in the hashset.

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
      //initializing map
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
          //if target - k exists
            if(map.containsKey(sum - k))
              //get the number of times that sum has occured before
                count += map.get(sum - k);
          //add 1 to the occurrence count of the sum in the map
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
