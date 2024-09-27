//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        int rsum = 0;
        int result = 0;
        
       map1.put(0,1);
        
        
        for(int i = 0; i < nums.length; i ++){
            
            
            
            rsum = rsum + nums[i];
            
             if(map1.containsKey(rsum - k)){
               
               result = result + map1.get(rsum - k);
           }
            
            if(!map1.containsKey(rsum)){
                
                map1.put(rsum,1);
            }
            
            else {
                
                
                map1.put(rsum,map1.get(rsum) + 1);
            }
            
           
          
          /*  else if(rsum - k == 0){
                
                map1.put(0,1);
                result = result + 1;
            } */
      
        }
           
        return result;
        
        
    }
}