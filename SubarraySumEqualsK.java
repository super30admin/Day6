// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

//Running sum is used to solve this problem. HashMap DS is used whenever new sum is found.
// We look for rsum - k in hashmap. If found add the freq to the total.


import java.util.*;
public class SubarraySumEqualsK {
    
    public static int subarraySum(int[] nums, int k) {
        
        if(nums.length==0 || nums == null)
        {
            return 0;
        }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rsum =0,total = 0;
        for(int i=0;i<nums.length;i++)
        {
            rsum+=nums[i];
            
            if(map.containsKey(rsum-k))
            {
                total+=map.get(rsum-k);
            }
            
            map.put(rsum, map.getOrDefault(rsum,0)+1);
            
        }
        
        return total;
    }

    public static void main(String args[])
    {
        int nums[] = {3,4,7,2,-3,1,4,2,0,1};
        int k = 7;
        System.out.println(subarraySum(nums, k));
    }
}
