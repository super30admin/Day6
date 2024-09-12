package com.ds.rani.hashing;

import java.util.HashMap;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose
 * sum equals to k.
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000]. The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
//Approach:Subarray sum problem,running sum pattern
public class SubArraySumEqualK {

    //Time complexity o(n)
    //Space complexity o(n)
    /**
     * @param nums
     * @param k
     * @return
     */
    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0, 1 );

        int runningSum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int compliment = runningSum - k;
            if (map.containsKey( compliment )) {
                count = count + map.get( compliment );
            }
            map.put( runningSum, map.getOrDefault( runningSum, 0 ) + 1 );
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1,1};
        System.out.println( SubArraySumEqualK.subarraySum( arr, 2 ) );

    }
}






