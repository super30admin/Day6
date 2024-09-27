
// Time Complexity : O(n)
//Space Complexity: O(n).
//Any issues faced while coding: No


class SubArraySumK{
    public int subarraySum(int[] nums, int k) {
        
        if(nums== null || nums.length==0) return 0;
        
        if(nums.length==1){
            return nums[0] == k ? 1: 0; 
        }        
        
        
        Map<Integer,Integer> map= new HashMap();
        
        
        int rSum=0; 
        int count=0;
        
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            
            rSum = rSum +nums[i];        
           if(map.containsKey(rSum-k)){
                count+=map.get(rSum-k);
            }
            
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }        
        return count;
    }    
}
