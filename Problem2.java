
// 525.
// Time complexity : O(n)
// Space complexity : O(n)

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        if(nums == null || nums.length == 0)
            return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); 
        int rSum =0;
        int start = 0; int end = 0;

        for(int i = 0; i < nums.length; i++)
        {
            rSum = nums[i] == 0 ? rSum -1: rSum + 1;
            if(map.containsKey(rSum))
            {
                if(max < i - map.get(rSum))
                {
                    max = i - map.get(rSum);
                    end = i; start = map.get(rSum) + 1;
                }
            } else {
                map.put(rSum, i);
            }
        }
     return max;   
    }
}


