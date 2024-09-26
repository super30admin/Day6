//time complexity: O(n), n is length of array
//space complexity:O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int findMaxLength(int[] nums) {
        int r = nums.length;
        
        int cumSum = 0;
        int maxLen = 0;
        
        //map to record 
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,-1);
        
        for(int i = 0; i< r; i++) {
            //change 0's to -1
            if (nums[i] == 0) {
                nums[i] = -1;
            }
            
            //find cumulative sum
            cumSum += nums[i];
            
            //if sum is present in hashMap, that means 
//we have encountered a subarray of equal 0's and 1's
            if(map.containsKey(cumSum)) {
                //get max length by comparing current subArray length and prev maxLen
                maxLen = Math.max(i - map.get(cumSum), maxLen);
            } else {
                // put (cumSum,index) only when cumSum does not exist in Map
                map.put(cumSum, i);
            }
        }
        
        return maxLen;
    }
}