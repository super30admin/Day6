// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContiguousArray 
{
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxlen = 0;
        
        map.put(0,-1);
        
        for(int i = 0; i < nums.length; i++)
        {
          if(nums[i] == 0)
              sum += -1;
          else if(nums[i] == 1)
              sum += 1;
            
          if(!map.containsKey(sum))
              map.put(sum,i);
          else
              maxlen = Math.max(maxlen, i-map.get(sum));
        }
      return maxlen;  
    }
}
