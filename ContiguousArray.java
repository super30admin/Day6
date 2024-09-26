//Q Contiguous Array
// Time Complexity : O(n) , n is the size of array
// Space Complexity : O(n)-if running sum is ditinct
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



// Your code here along with comments explaining your approach
/* As we have to calculate max length of contiguous subarrays, so store running sum with the index when first time unique running sum appears
Using Running Sum Pattern.Steps
      1) Create a map for storing the running sum and the index
      2) Initialise the map with 0 as key and -1 as value////suppose consider case [1,0] or [0,1]
      3) Iterate over array and Calculate the running sum, by subracting running sum with 1 if nums[i]==0 and adding 1, if nums[i]==1
      4) Check whether running sum exists in the map , if it exists then just calculate difference between current index and the running sum index. If it is greater than the max length, just update it.
      6) If map doesn't contain the running sum, just add it with its index;
*/

import java.util.*;
class Solution18 {
    public int findMaxLength(int[] nums) {
        
        if(nums==null || nums.length==0){
            return 0;
        }


         /** Optimised using Running Sum Pattern   */
           
          //Storing Running Sum & Index
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);//suppose consider case [1,0]
        
        int runningSum = 0;
        int maxLen = Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex  =0;
        
         for(int i=0;i<nums.length;i++){
        
             runningSum += nums[i]==0 ? -1 : +1;
             
             /*if(nums[i]==1){
                 runningSum += 1;
             }else if(nums[i]==0){
                 runningSum = runningSum - 1;
             }*/
             
             if(map.containsKey(runningSum)){
                 //maxLen = Math.max(maxLen,i-map.get(runningSum));
                 int len = i-map.get(runningSum);
                 if(maxLen<len){
                     maxLen = len;
                     startIndex = map.get(runningSum)+1;
                     endIndex   = i;
                 }
                 
             }else{
                map.put(runningSum,i);    
             }
             
         }
        
        System.out.println("Start Index = "+startIndex+" End Index ="+ endIndex);
        
         return maxLen==Integer.MIN_VALUE ? 0:maxLen;//Needs to be checked if only 1s or zeros are  there then initial maxLen will not be updated*/



         /**        */
        
        /* Brute Force 
        //TC -O(n^2)
        //SC -O(1);
        //Error : TLE
        
       
        
        int maxLen = Integer.MIN_VALUE;
        int zeroCount = 0;
        int onesCount = 0;
        
        for(int i=0;i<nums.length;i++){
            zeroCount =onesCount = 0;
            for(int j=i;j<nums.length;j++){
                
                if(nums[j]==1){
                    zeroCount++;
                }else{
                    onesCount++;
                }
                
                if(zeroCount==onesCount){
                    maxLen = Math.max(maxLen,j-i+1);
                }
                
            }
        }
      
        return maxLen==Integer.MIN_VALUE ? 0:maxLen;//Needs to be checked if only 1s or zeros are there then initial maxLen will not be updated and will return Integer.MIN_LEN as max length.But I have to return 0

        */
    }
}