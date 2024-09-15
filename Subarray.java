public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        if(k==0)
        {
            return 0;
        }
        
        for(int i = 0;i< nums.length;i++)
        {
            sum += nums[i];
            
            if(!map.containsKey(sum))
            {
                map.put(sum,1);
            }
                if(map.containsKey(sum-k))
                count++;
    
        }
        
        return count;
        
    }
}class Subarray {
    
}
