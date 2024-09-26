//Time Complexity: O(nums.length)
//Space Complexity: O(nums.length)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);int max = 0;
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) runningSum += 1;
            else runningSum -= 1;
            if(map.containsKey(runningSum)) {
                max = Math.max(max, i - map.get(runningSum));
            }
            else {
                map.put(runningSum, i);
            }
        }
        return max;
    }
}

