// Time Complexity : O(N), where N is the length of nums. 
// Space Complexity : O(N), to maintain the running sum information in the hashmap.

import java.util.*;
class Solution1 {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int runningSum = 0, count = 0;
        //maintain a map where key is the runningSum and value is the frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        //putting initial valus. 
        map.put(0,1); 
        for(int num: nums) {
            runningSum += num;
            //if map contains runningSum - k, it means we have found contiguous subarrays whose sum equals k. 
            if (map.containsKey(runningSum - k)) {
                //incrementing the count
                count += map.get(runningSum - k);
            }
            // putting the running sum and the frequency in the map 
            map.put(runningSum, map.getOrDefault(runningSum, 0)+1);
        }
        return count; 
    }
}