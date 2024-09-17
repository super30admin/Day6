package HashFunction;

import java.util.HashMap;

/*
-------------------------------------------------------------------------------------------------------
Time complexity : o(n)
space complexity: o(n)
Did this code run successfully in leetcode : yes
problems faces : no
 
*/public class LongestContiguosSubarray {

    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer>  map = new HashMap<Integer,Integer>();
        int rsum =0;
        int maxLength = 0;
        map.put(0, -1);
        
        for(int i=0;i<nums.length;i++)
        {
            rsum = nums[i] == 0? rsum-1 : rsum+1;
            if(map.containsKey(rsum))
            {
                maxLength = Math.max(maxLength, i-map.get(rsum));
            }
            else
            {
                map.put(rsum, i);
            }
        }
        
        return maxLength;

    }

}
