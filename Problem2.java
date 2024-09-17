// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    // running sum algo
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // if found 0 then subtract 1 else for 1 add 1 to runningSum
            if(nums[i] == 0) {
                rSum -= 1;
            } else {
                rSum += 1;
            }


            if (map.containsKey(rSum)) {
                maxlen = Math.max(maxlen, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return maxlen;
    }
}