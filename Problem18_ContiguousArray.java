// Time Complexity : O(n) -> n: length of the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0, max = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            rSum += (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}