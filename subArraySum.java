// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : first I was using two for loops it gave me TLE. So, I take refrence from youtube to get to know about efficient algorithm and done the coding

import java.util.HashMap;

class Main {
    public static int subarraySum(int[] nums, int k) {

        // here we are using hashmap to make a track of prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();

        int result = 0;

        // to store the prefix sum
        int sum = 0;

        // here we are traverse through all the nums in the array
        for (int i = 0; i < nums.length; i++) {
            // add each element in the sum
            sum += nums[i];
            // if sum is equal to k we increase the count of the result
            if (sum == k)
                result++;

            int prefixSum = sum - k;

            // if map already contains prefixSum that means we can get k from
            // substract prefix from currentSum
            if (map.containsKey(prefixSum)) {
                result += map.get(prefixSum);
            }

            // if prefix sum repeats that means we can get subarray more than one time by
            // substracting prefix from currentSum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println("subArray sum: " + subarraySum(nums, k));
    }
}