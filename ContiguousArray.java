//Time complexity - O(n)

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        //edge case if the array is null or length is o
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int rsum = 0;
        int max = 0;
        hmap.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            rsum = nums[i] == 0 ? rsum - 1 : rsum + 1;
            if(hmap.containsKey(rsum)){
                max = Math.max(max, i - hmap.get(rsum));
            }else{
                hmap.put(rsum, i);
            }
        }
        return max;
    }
}