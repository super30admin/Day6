class Solution {
    public int findMaxLength(int[] nums) {
        
        int currSum=0;
        int count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                currSum+=1;
            }
            if(nums[i]==1)
            {
                currSum+=-1;
            }
            
            if(h.containsKey(currSum))
            {
                count=Math.max(count,i-h.get(currSum));
            }
            else
            {
                h.put(currSum,i);
            }
            
        }
        return count;
    }
}