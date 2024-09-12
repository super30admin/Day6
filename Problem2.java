// Time Complexity : O (n) where n is length of nums
// Space Complexity : O(n) as n different sums can be in map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :Getting Space Complexity

import java.util.HashMap;

public class Problem2 {
    class Solution {
        public int findMaxLength(int[] nums) {
            
        // Use Map to store running sum and first occurence of that sum. Later when rs becomes same,
        // difference in length is used.
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        int maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                sum+=1;
            else sum-=1;
            
            if(map.containsKey(sum))
            {
                int value=map.get(sum);
                int len=i-value;
                maxlen=Math.max(len,maxlen);
            }
            else
            {
                map.put(sum,i);
            }
        }
            return maxlen;
            
        }
    }
}
