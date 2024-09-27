class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        
        int sum = 0;
        
        Map<Integer, Integer> fre = new HashMap<>();
        fre.put(0,-1);
        int max =0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum = sum-1;
            }
            else{
                sum = sum +1;
            }
            
            if(!fre.containsKey(sum))
            {
                fre.put(sum, i);
            }
            else{
                int ind = fre.get(sum);
                ind = i - ind;
                if(ind>max)
                {
                    max = ind;
                }
            }
        }
        return max;
    }
}
//runtime: O(nm)--O(n) for looping through the array and O(m) is for the .containskey method
//space complexity : O(m) for storing first occurance of 0 and 1
