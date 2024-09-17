import java.util.HashMap;

// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
         int results = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int rsum = 0;
        for(int i=0;i<nums.length;i++)
        {
            rsum = rsum+nums[i];
            if(map.containsKey(rsum-k))
            {
                results = results + map.get(rsum-k);
            }
            if(!map.containsKey(rsum))
            {
               map.put(rsum,0);
            }
            map.put(rsum,map.get(rsum)+1);
        }
        return results;
    }
    }