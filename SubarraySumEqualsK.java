// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, it was clear during today's class

class SubarraySumEqualsK
{
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0,count=0;        
        for(int i = 0; i < nums.length; i++)
        {
           sum += nums[i];
           if(map.containsKey(sum-k))
               count += map.get(sum-k);
           map.put(sum, map.getOrDefault(sum,0)+1); 
        }
        return count;
        
        
    }
}
