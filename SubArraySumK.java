// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;
                
        map.put(0,1);
        for(int i=0; i<nums.length; i++ ) {
        
            rSum += nums[i];            
            
                        
            if(map.containsKey(rSum-k)){
                
                count = count + map.get(rSum-k);
            }
            
            if(!map.containsKey(rSum)){ 
                map.put(rSum,1);
            }
            else{
                map.put(rSum, map.get(rSum)+1);
                
            }

            
        }
        
        return count;        
        
    }
}