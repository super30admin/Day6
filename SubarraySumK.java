// Approach: The idea is to store all the prefix sums of the array and their associated frequencies in a hashmap. Whenever a
// prefix sum of x is encountered, check if a prefix sum of (x - k) is present in the hashmap. If it is, add its associated
// frequency to the final count of subarrays with a sum equal to k.
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Map;
import java.util.HashMap;

public class SubarraySumK {

    int countSubarrays(int[] arr, int k) {
        // map - prefix sum to frequency
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0, count = 0;
        for (int i : arr) {
            currSum += i;
            if (currSum == k) {
                count++;
            }
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumK sask = new SubarraySumK();
        int[] arr = { 10, 2, 5, 4, 1, 6, 3 };
        int k = 10;
        System.out.println("Count of subarrays with sum k is: " + sask.countSubarrays(arr, k));
    }
}