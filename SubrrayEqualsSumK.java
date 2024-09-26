//Q - Subarray Sum Equals K
// Time Complexity : O(n) , n is the size of array
// Space Complexity : O(n)-if running sum is distinct
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* As we have to calculate total number of contiguous subarrays, so store running sum with the count how many time running sum appears
Using Running Sum Pattern.Steps
      1) Create a map for storing the running sum and the count
      2) Initialise the map with 0 as key and 1 as value
      3) Iterate over array and Calculate the running sum
      4) While iterartion, find the compliment of running sum and the k. 
      5) Check whether compliment exists in the map , if it exists then just add its values to the global count
      6) Store the running sum in the map with a default value 1, if running sum already exists just increment the running sum count in the map
*/

import java.util.*;

class Solution17 {
    public int subarraySum(int[] nums, int k) {
        
        if(nums==null || nums.length==0){
            return 0;
        }
        
       /** Optimised using Running Sum Pattern   */

       int count =0;
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,1);//Assuming that rsum is 0 and count is 1
       int rSum =0;
       
       for(int i=0;i<nums.length;i++){
           
           rSum += nums[i];
           
           int compliment = rSum-k;
           
           if(map.containsKey(compliment)){
               count += map.get(compliment);
           }
           map.put(rSum,map.getOrDefault(rSum,0)+1);
       }
       
       
       return count;
       
       /** */
       /* 
        Brute Force
       //O(n^2)
        int count = 0;
        int sum;
        for(int i=0;i<nums.length;i++){
            sum = 0;//have to reset every time on moving i pointer
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                
                if(sum==k){
                   count++;   
                }
                
            }
        }
        
        return count;*/
    }
}