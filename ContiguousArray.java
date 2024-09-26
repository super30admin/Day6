// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int rSum = 0;
        map.put(0,-1);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                rSum = rSum + 1;
            else
                rSum = rSum - 1;
            if(map.containsKey(rSum))
                result = Math.max(result, (i - map.get(rSum)));
            else
                map.put(rSum, i);
        }
        return result;
    }
}
