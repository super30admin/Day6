// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0||nums.length == 1) return 0;
        int runningSum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 0) runningSum--;
            else runningSum++;
            if(!map.containsKey(runningSum)) {
                map.put(runningSum, i);
            } else {
                max = Math.max(max, i - map.get(runningSum));
            }
        }
        return max;
    }
}