// Problem 2: 

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't think of this solution unless explained in the session.


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0; int max = 0;
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++) {
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            if(map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}