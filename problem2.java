// Problem2 (https://leetcode.com/problems/contiguous-array/)

// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        int rSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }
            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;

    }
}
