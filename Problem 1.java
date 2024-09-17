//Time Complexity: O(N) where N is the length of nums array
//Space Complexity: O(N)

import java.util.*;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int rSum = 0;
        int count = 0;
        hmap.put(0,1);
        
        for(int i = 0; i < nums.length; i++)
        {
            rSum += nums[i];
            int compliment = rSum - k;
            if(hmap.containsKey(compliment))
            {
                count += hmap.get(compliment);
            }
            hmap.put(rSum, hmap.getOrDefault(rSum,0) + 1);
        }
        return count;
    }
}