// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums==null||nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                sum=sum-1;
            }
            else
            {
                sum=sum+1;
            }    
            
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else
            {
               max= Math.max(max,i-(map.get(sum)));
            } 
            
        }    
        
        return max;
        
    }
}
