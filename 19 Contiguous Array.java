// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        //aesha
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int prefixsum = 0;
        int maxlength = 0;
        map.put(0, -1); // prefix, index
        for (int i = 0; i < n; i++) {
            prefixsum += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(prefixsum)) {
                int subarraylength = i - map.get(prefixsum);
                maxlength = Math.max(maxlength, subarraylength);
            } else {
                map.put(prefixsum, i);
            }
        }
        return maxlength;

    }
}