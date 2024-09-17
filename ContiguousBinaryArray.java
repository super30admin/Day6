// Time Complexity- O(n)
// Space Complexity- O(n)
//Successfully ran on leetcode

import java.util.HashMap;

class ContiguousBinaryArray {
 public int findMaxLength(int[] nums) {
     
     
     if(nums.length==0 || nums==null) return 0;
     
     HashMap<Integer, Integer> map= new HashMap<>();
     map.put(0,-1);
     
     int max=0;
     int rsum=0;
     
     for(int i=0;i< nums.length; i++){
         
         if(nums[i]==1) rsum++;
         else rsum--;
         
         if(map.containsKey(rsum)){
             max= Math.max(max, i- map.get(rsum));
         }
         else 
             map.put(rsum, i);
     }
     return max;
 }
}
