class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums == null || nums.length==0)
            return 0;
        int rsum =0;
        int max=0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
                rsum += 1;
            else
                rsum -= 1; 
            
            if(!hm.containsKey(rsum))
            {
                 hm.put(rsum, i);
            }
            else {
                max = Math.max(max, i-hm.get(rsum));
            }
            
        }
        
        return max;
    }
}
