// Approach: By replacing all 0s with -1, the problem can be simplified to finding subarrays with a sum equal to 0.
// Additionally, we need to identify the longest among these subarrays. To achieve this, we store the ending indices of
// prefix sums in the hashmap only when they are encountered for the first time.
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Reference: https://youtu.be/VGp_o-YCLWM

import java.util.Map;
import java.util.HashMap;

public class ContiguousArray {

    int count(int[] arr) {
        // prefix sum to ending index map
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += (arr[i] == 0 ? -1 : 1);
            // We need to find subarrays with sum = 0 (along with their length, that's why we need the indices)
            if (currSum == 0) {
                maxLen = (i + 1);
            }
            if (map.containsKey(currSum)) {
                maxLen = Math.max(maxLen, i - map.get(currSum));
            } else {
                map.put(currSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        ContiguousArray ca = new ContiguousArray();
        int[] arr = { 0, 1, 0, 0, 1, 0, 0, 0, 1, 1 };
        System.out.println("Length of longest subarray with equal no.of 0s and 1s is: " + ca.count(arr));
    }
}