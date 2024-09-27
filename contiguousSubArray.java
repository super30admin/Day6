//time o(n) where n is the length of the array
//space o(1) map will have fixed size

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length <= 0)
            return 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        int rSum = 0, max = 0, length;
        sumMap.put(rSum, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum -= 1;
            } else {
                rSum += 1;
            }
            if (sumMap.containsKey(rSum)) {
                length = i - sumMap.get(rSum);
                if (length > max)
                    max = length;
            } else {
                sumMap.put(rSum, i);
            }
        }
        return max;
    }
}