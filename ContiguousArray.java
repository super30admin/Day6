class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public int findMaxLength(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(); //map contains sum as key and its pos as value because we have
        // to return len so storing pos of each sum
        map.put(0, -1); //0 is occuring at pos -1
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < len; i++) {
            sum = sum + (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}