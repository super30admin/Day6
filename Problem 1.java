// Problem 1: 

// Time Complexity : O(n) -
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int rSum  = 0; int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            int compliment = rSum - k;
            if(map.containsKey(compliment)) {
                count += map.get(compliment);
            }
            if(!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }
        return count;
    }
}