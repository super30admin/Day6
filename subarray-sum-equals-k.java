class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length == 0)
        {
            return 0;
        }
        
        Map<Integer, Integer>  freq = new HashMap<>();
        freq.put(0, 1);
        int sum =0;
        int count =0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            
            if(freq.containsKey(sum-k))
            {
                count = count + freq.get(sum-k);
            }
            if(!freq.containsKey(sum))
            {
                freq.put(sum, 1);
            }
            else{
                freq.put(sum, freq.get(sum)+1);
            }
        }
        return count;
        
    }
}
//runtime: O(nm)--O(n) for looping through the array and O(m) is for the .containskey method
//space complexity : O(m) for storing the frequence of the running sum
