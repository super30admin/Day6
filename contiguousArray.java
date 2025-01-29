// Problem2 (https://leetcode.com/problems/contiguous-array/)

// Time Complexity : o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * In this problem, hash map is used to store the calculated running sum and the index at which it first occured. We add a dummy input to the 
 * hash map to capture the edge case at which contiguous array starts from the 0th index of the array.We calculate the running sum as +1 to 1 
 * and -1 to 0. and while we traverse the running sum, if we see the runningSum already in the hash map we find result as
 * max(result, current index-index at which the running sum 1st occured). Finally we return the result.
 */

 class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int result =0;
        map.put(0,-1);
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==1){
                runningSum = runningSum+1;
            }
            else{
                runningSum = runningSum-1;
            }
            if(map.containsKey(runningSum)){
                result = Math.max(result, i-map.get(runningSum));
            }
            else{
                map.put(runningSum, i);
            }
        }
        return result;
    }
}