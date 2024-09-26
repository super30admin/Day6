// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : This approach came later and I learned in class. 
// The peak and low values is helpful as it helps adding and / or subtracting 


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int currSum = 0, maxLen = 0;
        
        // If we encounter a sum as 0 we go to the 
        // beginning of the array at index -1
        // as everything before that is a part
        // of the req subarray
        tracker.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            
            // If the value of the array is 1 then 
            // add 1 else if the value is 0 then 
            // add 0
            currSum = currSum + (nums[i] > 0 ? 1 : -1);
            
            if (tracker.containsKey(currSum)) {
                maxLen = Math.max(maxLen, i - tracker.get(currSum));
            } else {
                tracker.put(currSum, i);
            }
        }
        
        return maxLen;
    }
}