class Solution {
    // Time Complexity : O(N) where n is the size of input array
    // Space Complexity : O(N) - hashmap store n entries
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope
    public int findMaxLength(int[] nums) {
        //check base case
        if (nums == null || nums.length == 0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        // corner case when we see count = 0 for the first time eg. [0,1] - we need 0 index reference
        map.put(0,-1);
        int maxLen = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            //replace all 0 with -1 so that we can find maximum subarray length with sum = 0
            count += (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(count))
                maxLen = Math.max(maxLen,i - map.get(count));
            else
                map.put(count,i );
        }
        return maxLen;
    }
}
