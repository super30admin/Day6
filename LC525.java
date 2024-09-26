class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int rsum = 0;
        int count = 0;
        
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                rsum = rsum-1;
            }
            else
            {
                rsum = rsum + 1;
            }
            
            if(map.containsKey(rsum))
            {
                count = Math.max(count,i-map.get(rsum));
            }
            else
            {
                map.put(rsum,i);
            }
        }
        
        return count;
    }
}