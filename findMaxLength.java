class Solution {
    public int findMaxLength(int[] nums) {
        
        int[] rSum=new int[nums.length];
        
        rSum[0]=(nums[0]==0)?-1:1;
        
        for(int i=1;i<nums.length;i++)
        {
            rSum[i]=rSum[i-1]+((nums[i]==0)?-1:1);
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        int len=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(rSum[i]))
            {
                len=Math.max(len,i-map.get(rSum[i]));
            }
            else
                map.put(rSum[i],i);
        }
        
        return len;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no