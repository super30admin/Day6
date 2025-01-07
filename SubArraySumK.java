/*
    Leetcode problem 560: Subarray Sum Equals K
    T.C: O(n) :: S.C: O(n)

    Solved using a single HashMap, by iterating over the array once and calculating
    the running sum. We can now store this running sum's occurrence as key and value.
    Perform a condition check if diff = rSum - target is present in HashMap add its
    occurrence to the resultant count and return in the end.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;

        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> rSumMap = new HashMap<>();

        rSumMap.put(rSum, rSumMap.getOrDefault(rSum, 0) + 1);

        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];

            if (rSumMap.containsKey(rSum - k)) {
                count += rSumMap.get(rSum - k);
            }

            rSumMap.put(rSum, rSumMap.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}