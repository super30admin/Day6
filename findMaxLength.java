import java.util.HashMap;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        //check base cases in case the array is empty
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        
        //our first pair must be (0, -1) for easier addition purposes later on
        sumMap.put(0, -1);
        int rSum = 0, maxLen = 0;
        
        //loop through all the elements
        for(int i = 0; i < nums.length; i++){
            
            //if the element at index is 0 then we subtract one from running sum,
            //otherwise it is a 1 so we add 1
            // 0 => -1
            //1 => +1
            rSum = (nums[i] == 0)? rSum - 1: rSum + 1;
            
            //if  map doesn't contain that running total yet then we add it along with index
            if(!sumMap.containsKey(rSum))
                sumMap.put(rSum, i);
            
            //otherwise we check at previous index and subtract with current index to get length
            else{
                maxLen = Math.max(maxLen, i - sumMap.get(rSum));
            }
        }
        
        return maxLen;
    }
}