// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Contigious Array
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            int val = nums[i] == 0? -1: 1;
            sum = sum + val;
            if(map.containsKey(sum)) {
                ans =  Math.max(ans, (i-map.get(sum)));
            }
            else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
