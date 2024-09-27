// Time Complexity : linear
// Space Complexity : linear
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int ans = 0, rSum = 0;
        for(int i=0; i<nums.length; i++) {
            rSum += nums[i] == 0 ? -1 : 1;
            
            if (map.containsKey(rSum)) {
                ans = Math.max(ans, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return ans;
    }
}
