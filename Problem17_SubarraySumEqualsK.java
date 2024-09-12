// Time Complexity : O(n) -> n: length of the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, rSum = 0;
        for(int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if(map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            } 
            if(!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }
        return count;
    }
}