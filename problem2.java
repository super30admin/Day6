// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();
        int rSum = 0;
        int max = 0;
        int count = -1;
        hm.put(0,count);
        for(int i: nums){
            count=count+1;
            if(i==0)
                rSum = rSum - 1;
            else if(i==1)
                 rSum = rSum + 1;
            if(hm.containsKey(rSum)){
                max=Math.max(max, count - hm.get(rSum));
            }
            else
                hm.put(rSum, count);
        }
        return max;
    }
}