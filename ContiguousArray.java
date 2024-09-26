// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :no
I initializes counter equal to 0 at index “-1” , so that we do not miss the subarray with equal numbers of 0s and 1s starting from nums[0].

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        if (n<=0) return 0;
        Map<Integer,Integer> countToIndex = new HashMap<>();
        countToIndex.put(0,-1); // just before the beginning of the array nums
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i ++){
            count = count + (nums[i]==0?1:-1);
            if (!countToIndex.containsKey(count)){
                countToIndex.put(count, i);
            }
            else{
                maxLen = Math.max(maxLen, i-countToIndex.get(count));

            }

        }
        return maxLen;
    }

}
