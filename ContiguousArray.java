import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // to detect initial sub array
        
        int rSum = 0, max = 0;
        
        // running sum pattern, to eliminate nested iterations
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) rSum--;
            else rSum++;
            
            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        
        return max;
    }
}