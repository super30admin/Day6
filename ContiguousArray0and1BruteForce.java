//Brute force contiguous array with max length of balanced o and 1
class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen    = 0;
        for(int start = 0;start<=nums.length -1;start++){
            int zerosCount = 0;
            int onesCount = 0;
        for (int end = start; end<=nums.length -1;end++){
            
         
                if(nums[end] == 0){
                   zerosCount++; 
                }
                else{
                      onesCount++;
                }
                
            
            if(zerosCount == onesCount){
                maxLen = Math.max(maxLen,end-start+1);
        }}
            
        }
    
        return maxLen;
    }
}

/*
TimeComplexity O(n2)
Space Complexity O(1)
*/
