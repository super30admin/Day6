// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No real issues


// Your code here along with comments explaining your approach

/* I wrote this code following the pattern X-K = target , where X is the cumulative sum */

public class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int cumulativeSum=0;
        int result=0;
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++)
        {
            cumulativeSum+=nums[i];
            int target=cumulativeSum-k;
            
            if(map.containsKey(target))
                result+=map.get(target);
        
            map.put(cumulativeSum,map.getOrDefault(cumulativeSum,0)+1);
        }
        
        return result;
    }
}
    
}