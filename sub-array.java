//TC: O(N)
//SC: O(N)
class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1);
        int rSum = 0, maxLen = 0;
        
        for(int i=0; i<nums.length; i++) {
            //calculate running sum
            rSum = (nums[i] == 0) ? rSum-1: rSum+1;
            
            //check if running sum is present in the map
            if (sumMap.containsKey(rSum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(rSum));
            } else {
                sumMap.put(rSum, i);
            }          
            
        }
        return maxLen;
    }
}