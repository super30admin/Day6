// Time Complexity : O(n) --> where n is lengths of input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode (525): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int rSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            
            if (map.containsKey(rSum)) {
                int curr = i - map.get(rSum);
                max = Math.max(max, curr);
            }
            else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}