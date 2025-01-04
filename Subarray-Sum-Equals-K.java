// ## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Description: Here we are taking an rsum of all the elements. Initially rsum is initialised to 0.
// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        //Base Condition
        if(nums==null || nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int rsum=0;
        int cnt=0;
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k)){
                cnt=cnt+map.get(rsum-k);
            }
            map.put(rsum,map.getOrDefault(rsum,0)+1);
        }
        return cnt;
    }
}