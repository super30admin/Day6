package com.ds.rani.hashing;

import java.util.HashMap;

/**
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * Example 1:
 * Input: [0,1] Output: 2 Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * Example 2:
 * Input: [0,1,0] Output: 2 Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 */

//Approach:Running sum pattern
public class MaxLengthArray {

    //Time complexity o(n)
    //space complexity o(n)

    /**
     * @param nums
     * @return
     */
    public static int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxLen = 0;
        int runningSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0, -1 );
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                runningSum++;
            } else {
                runningSum--;
            }
            if (map.containsKey( runningSum )) {
                int len = i - map.get( runningSum );
                maxLen = Math.max( len, maxLen );
            } else
                map.put( runningSum, i );
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1,0,0};
        System.out.println( MaxLengthArray.findMaxLength( arr ) );
    }
}

