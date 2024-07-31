// Time complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach: Maintain a hashmap with (runningSum, count of running sum). Whenever the diff b/w 2 running sums = k, we can say that subarray is of sum k


import java.util.HashMap;
import java.util.Map;

class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int runningSum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++) {
            runningSum+= nums[i];
            if(map.containsKey(runningSum-k)){
                count+= map.get(runningSum-k);
            }
            map.put(runningSum, map.getOrDefault(runningSum,0)+1);
        }
        return count;
    }
}