
// Leetcode 560 - 560. Subarray Sum Equals K
// Time Complexity - O(n)
// Space complexity - O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> hashmap = new HashMap();
        
        hashmap.put(0,-1);
        
        int cumulativeSum = 0;
        int maxLength = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] == 0){
                cumulativeSum = cumulativeSum-1;
            }else{
                cumulativeSum = cumulativeSum+1;
            }
            
            if (hashmap.containsKey(cumulativeSum-0)){
                
                maxLength = Math.max(maxLength, i-hashmap.get(cumulativeSum));
                
            }else{
                hashmap.put(cumulativeSum, i);
            }
        }
        
        return maxLength;
    }
}