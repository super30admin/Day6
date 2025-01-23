/*
Have running sum, rsum - > if 0, do -1. If 1, do +1
Have a HashMap with key as rsum and value as index.
To calculate max, look for max of (max, i - map.get(rsum)).
map.put(rsum, 1) for every rsum you encounter initially.
S.C - O(n)
*/

import java.util.HashMap;

public class ContiguosArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return 0;
        }

        int rsum = 0;
        int max = 0;

        hs.put(0, -1);

        int i = 0;

        while(i<nums.length)
        {
            if(nums[i] == 1)
            {
                rsum+=1;
            }
            else
            {
                rsum-=1;
            }
            if(hs.containsKey(rsum))
            {
                max = Math.max(max, (i-hs.get(rsum)));
            }
            else
            {
                hs.put(rsum,i);
            }
            i++;
        }
        return max;
    }
}
