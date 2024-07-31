// Time Complexity :O(n))
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        int rsum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            rsum += nums[i];
            if(map.containsKey(rsum - k))
            {
                count += map.get(rsum-k);
            }
            if(!map.containsKey(rsum))
            {
                map.put(rsum,1);
            }
            else
            {
                map.put(rsum,map.get(rsum)+1);
            }
        }
    return count; 
    }
}