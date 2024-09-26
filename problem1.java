import java.util.*;

public class problem1 {

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int rsum=0;
        int count=0;
        
        //condition
        hm.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            rsum = rsum+nums[i];
            int diff = rsum-k;
            
            if(hm.containsKey(diff)){
                count = count + hm.get(diff);
            }
                hm.put(rsum,hm.getOrDefault(rsum,0)+1);
            
        }
        return count;
            
    }
}
