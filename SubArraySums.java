class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> h = new HashMap<>();
        
        
        
        int count=0;
        
        h.put(0,1);
        int currSum=0;
        
        for(int i =0;i<nums.length;i++)
        {
            currSum+=nums[i];
            int compliment = currSum - k;
            
            if(h.containsKey(compliment))
            {
                
               count+= h.get(compliment);
                
            }
            h.put(currSum,h.getOrDefault(currSum,0)+1);
          
        }
        return count;
    }
}