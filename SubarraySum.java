//Time complexity O(n)
//Space Complexity O(n)

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int rsum = 0, count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);

        //calculate the running sum for each index 
        for(int i = 0; i < nums.length; i++){
            rsum = rsum + nums[i];
            if(hmap.containsKey(rsum - k)){
                count = count + hmap.get(rsum-k) ;    
            }
            if(hmap.containsKey(rsum)){
                hmap.put(rsum, hmap.get(rsum) + 1);
            }else{
                hmap.put(rsum,1);
            }
        }
        return count;
    }
}