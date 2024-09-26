//PROBLEM - 205. Isomorphic Strings
/** 3 Pointer Approcach: 
 * Use 2 <Key,Value> of <CHAR,CHAR> hash sets ad HashMap data structure best suitable to hold K,V data.
 * APPROACH: 
 * 1. If Character1/Character2 is present as key then check corresponding Character with current Character.
 * 2. If match keep moving, if not retuen FALSE.
 * 3. Incase c/c not present add to HashMap.
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1) => constant 256 characters.  

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

class Solution {
    public int findMaxLength(int[] nums) {
        
        int max = 0 ;
        for(int i=0; i<nums.length-1; i++){
            
            int sum =0;
            int length = 0;
            
            for(int j=i; j<nums.length; j++){
                 length++;
                
                 if(nums[j]==0){
                    sum -= 1;
                 }else{
                    sum += 1; 
                 }
               
                if(sum==0){
                    max = Math.max(max,length);
                }
            }    
        }
        
        return max;
        
    }
}