// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length <= 1) return 0;
        int rSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++){
            rSum = (nums[i] == 0) ? rSum - 1 : rSum + 1;
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                max = Math.max(max, i - map.get(rSum));
            }
        }
        return max;
    }
}