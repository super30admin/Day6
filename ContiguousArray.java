//Time Complexity - O(n)
//Space Complexity - O(n)

import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength =0;
        int cumulativeSum = 0;
        Map<Integer, Integer> subArray= new HashMap<>();
        subArray.put(0, -1);
        for(int i = 0; i< nums.length; i++) {
            int sum = nums[i]==0? -1 : 1;
            cumulativeSum += sum;
            if (subArray.containsKey(cumulativeSum)) {
                maxLength = Math.max(maxLength, i - subArray.get(cumulativeSum));
            } else {
                subArray.put(cumulativeSum, i);
            }
        }
        return maxLength;

    }
}