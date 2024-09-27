// Time Complexity : linear
// Space Complexity : linear
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int ans = 0, rSum = 0;       
        for(int i=0; i<nums.length; i++) {
            rSum += nums[i];
            ans += map.getOrDefault(rSum-k, 0);
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return ans;
    }
}
