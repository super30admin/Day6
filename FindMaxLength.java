// Problem 525. Contiguous Array
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.HashMap;

class FindMaxLength {
    public int findMaxLength(int[] nums) {
        // null
        if (nums == null) {
            return 0;
        }
        int max = 0;
        int rsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rsum--;
            } else {
                rsum++;
            }

            if (map.containsKey(rsum)) {
                max = Math.max(max, i - map.get(rsum));
            } else {
                map.put(rsum, i);
            }
        }
        return max;
    }
}
