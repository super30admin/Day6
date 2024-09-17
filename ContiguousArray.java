
// Time Complexity : o(n) where n is the number of elements in the array nums
// Space Complexity : o(n) where n is the number of elements int the array nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        int maxLength=0, runningSum=0;
        indexes.put(0,-1); //edge case
        for(int i=0; i<nums.length;i++)
        {
            runningSum+=nums[i]==0?-1:1;
            if(!indexes.containsKey(runningSum))
                indexes.put(runningSum,i);
            else
                maxLength = Math.max(maxLength, i-indexes.get(runningSum));
        }
        return maxLength;
        
    }
}