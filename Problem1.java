// Time Complexity : O(n)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Use running sum pattern
// Save the differences in map for quick search
// If the computed difference exists in the map, we add the value in the map as the number of  sub arrays that equal k

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            //map.put(sum, map.getOrDefault(sum, 0) + 1);
            if(!map.containsKey(sum)) {
                map.put(sum, 0);
            }
            map.put(sum, map.get(sum) + 1);
        }
        return result;
    }
}