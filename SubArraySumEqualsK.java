// Time Complexity : O(n) where n is the number of elements in the array nums
// Space Complexity : O(n) where n is the number of elements in the array nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        int runningSum=0;
        int count=0;
        frequencies.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            runningSum+=nums[i];  
            if(frequencies.containsKey(runningSum-k))
                count+=frequencies.get(runningSum-k);
             frequencies.put(runningSum,frequencies.getOrDefault(runningSum,0)+1);
            
        }
        return count;
    }
}