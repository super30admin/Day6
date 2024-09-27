import java.util.HashMap;

// Time Complexity : o(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int preSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            preSum=preSum+nums[i];
            if(preSum==k)
            {
               count++; 
            }
            if(hm.containsKey(preSum-k))
            {
                count=count+hm.get(preSum-k);
            }
            
           // if preSum is not in map then add new entry or increment value by geting from hm
            int c=hm.getOrDefault(preSum,0);
            hm.put(preSum,c+1);
        }
        return count;
    }
}
