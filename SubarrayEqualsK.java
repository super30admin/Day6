// Time Complexity :0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum =0;
        int result=0;
        
        for(int i=0;i<nums.length;i++){
             rSum += nums[i];
            if(map.containsKey(rSum-k))
            {
                result = result + map.get(rSum-k); 
            }
             if(!map.containsKey(rSum)){
                map.put(rSum,0);
            }
            int val= map.get(rSum);
                map.put(rSum, val+1);            
        }
        
        return result;
    }
}
}