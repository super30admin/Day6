// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums==null||nums.length==0)
        {
            return 0;
        }   
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int count=0;
        int Rsum=0;
        
        
        for(int i=0;i<nums.length;i++)
        {
            int comp=0;
            Rsum=Rsum+nums[i];
            comp=Rsum-k;   
            if(map.containsKey(comp)){
                count=count+map.get(comp);
            }    
            
            map.put(Rsum, map.getOrDefault(Rsum, 0) + 1);
            
            
        }
    
      return count;        
    }
}