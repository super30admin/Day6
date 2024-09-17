import java.util.HashMap;
import java.util.Map;

// Time Complexity: O (N) N: length of array nums
// Space Complexity: O (N) due to hashmap
// Did this code successfully run on Leetcode : Yes
public class ContiguousArray_LC525 {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int currentSum = 0, maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();  // key: sum, value: index
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            currentSum += (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(currentSum))                // When two sums are equal, there are equal 0s and 1s between them¬
                maxLength = Math.max(maxLength, i - map.get(currentSum));
            else
                map.put(currentSum, i);
        }
        return maxLength;
    }
}
