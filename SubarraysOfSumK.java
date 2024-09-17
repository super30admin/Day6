package HashFunction;

import java.util.HashMap;

    /*
    -------------------------------------------------------------------------------------------------------
    Time complexity : o(n)
    space complexity: o(n)
    Did this code run successfully in leetcode : yes
    problems faces : no
    */
    
public class SubarraysOfSumK {

    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum =0;
        int count =0;
        map.put(0, 1);
        
        for(int i=0; i<nums.length;i++)
        {
            rsum=rsum + nums[i];
            if(map.containsKey(rsum-k))
            {
                count += map.get(rsum-k);
            }
            
            map.put(rsum, map.getOrDefault(rsum, 0)+1);
        }
        
        return count;
        
    }
}
