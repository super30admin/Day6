// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //hashmap with currSum and startIndex
        int maxLen = 0;
        int currSum = 0;
        
        //initializing sum as zero
        hashMap.put(0,-1);
        
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 0)
                currSum += 1;
            else
                currSum -= 1;
            
            if(hashMap.containsKey(currSum)){
                //max between max len and end index-startindex
                maxLen = Math.max(maxLen, i - hashMap.get(currSum));
                
            }
            else{
                hashMap.put(currSum, i);
            }
            
        }
        return maxLen;
        
    }
}