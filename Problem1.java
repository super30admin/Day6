// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Difficult to think about the approach at once.


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // HashMap stores computedSum until the current element
        // encountered
        HashMap<Integer, Integer> computedSum = new HashMap<>();
        computedSum.put(0, 1);
        
        int count = 0, curSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            curSum += nums[i];
            
            // if HashMap contains key curSum - k
            // then increase the count of the subarray
            if(computedSum.containsKey(curSum - k)) {
                count += computedSum.get(curSum - k);
            }
            // If we see the curSum for the first time then we add 0 as it's value
            // If we encounter the curSum again we add 1
            computedSum.put(curSum, computedSum.getOrDefault(curSum, 0) + 1);
        }
        
        return count;
    }
}