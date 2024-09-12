#Time complexity= O(n);
#Space Complexity=O(n);
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0|| nums==null)
        {
            return 0;
        }
        
        int count=0;
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,1);
        int rsum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            rsum=rsum+nums[i];
         
            int a=rsum-k;
            
            if(map.containsKey(a))
            {
                count=count+map.get(a);
            
            }
            map.put(rsum, map.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}