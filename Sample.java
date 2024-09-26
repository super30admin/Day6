// Time Complexity :O(n^2) time
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
Problem 1:Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++){
            int sum=0;
            for (int end = start; end < nums.length; end++){
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}