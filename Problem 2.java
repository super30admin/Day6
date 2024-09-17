//Time Complexity: O(N) where N is the length of nums array
//Space Complexity: O(N)

import java.util.*;

class FindMaxLength {

    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        
        int max = 0;
        int rSum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
                rSum -= 1;
            else
                rSum += 1;
            
            if(hmap.containsKey(rSum))
            {
                max = Math.max(max, i - hmap.get(rSum));
            }
            else
                hmap.put(rSum, i);
        }
        
        return max;
    }
}
