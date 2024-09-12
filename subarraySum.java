class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        int n=nums.length;
        
        if(n==1 && nums[0]!=k) return 0;
        
        if(n==1 && nums[0]==k) return 1;
        
        int[] rSum=new int[nums.length];
        
        rSum[0]=nums[0];
        
        for(int i=1;i<n;i++)
        {
            rSum[i]+=rSum[i-1]+nums[i];
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            
            if(map.containsKey(rSum[i]-k))
                count+=map.get(rSum[i]-k);
            
            if(map.containsKey(rSum[i]))
                map.put(rSum[i],map.get(rSum[i])+1);
            else
                map.put(rSum[i],1);
            
        }

        
        return count;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no