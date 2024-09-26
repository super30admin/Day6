// Time Complexity : O(n)
// Space Complexity : O(n) if all the elements are either 0 or 1.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLen = 0, prefixSum = 0;

        for(int i=0; i<nums.length; ++i){
            prefixSum += nums[i] == 0 ? -1 : 1;

            if(map.containsKey(prefixSum)){
                int len = i - map.get(prefixSum);

                maxLen = Math.max(maxLen, len);
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}